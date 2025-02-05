package Decorators.ApiHandler;

import javax.net.ssl.SSLSession;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class StudentApiHandler implements ApiHandler{
    @Override
    public HttpResponse<Integer> call() {

        System.out.println("Called student API");

        return new HttpResponse<Integer>() {
            @Override
            public int statusCode() {
                return 200;
            }

            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public Optional<HttpResponse<Integer>> previousResponse() {
                return Optional.empty();
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public Integer body() {
                return 0;
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return URI.create("/students");
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }
        };
    }
}
