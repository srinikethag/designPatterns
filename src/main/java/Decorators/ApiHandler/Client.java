package Decorators.ApiHandler;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<ApiHandler> apiHandlers = List.of(new AuthApiHandler(new LoggingApiHandler(new InstructorApiHandler())),
                new AuthApiHandler(new LoggingApiHandler(new StudentApiHandler())));

        apiHandlers.forEach(ApiHandler::call);
    }
}
