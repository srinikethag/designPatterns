package Decorators.ApiHandler;

import java.net.http.HttpResponse;
import java.util.Random;

public class AuthApiHandler implements ApiHandler{

    ApiHandler apiHandler;

    public AuthApiHandler(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    @Override
    public HttpResponse<Integer> call() {
        System.out.println("Check if the user is authorized");

        // random logic of handling API auth
        int random = new Random().nextInt() % 2;
        if (random == 0) throw new IllegalArgumentException("User Not Authorized");

        return apiHandler.call();
    }
}
