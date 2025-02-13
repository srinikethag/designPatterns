package Decorators.ApiHandler;

import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.Date;

public class LoggingApiHandler implements ApiHandler{

    public ApiHandler apiHandler;

    public LoggingApiHandler(ApiHandler apiHandler){
        this.apiHandler = apiHandler;
    }


    @Override
    public HttpResponse<Integer> call() {
        System.out.println("Current time of the call is " + Date.from(Instant.now()));

        HttpResponse<Integer> response = apiHandler.call();

        System.out.println(response.uri());
        System.out.println(response.statusCode());

        return response;
    }
}
