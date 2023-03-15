package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handler.AuthenticationHandler;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private final Map<String, String> users = new HashMap<>();

    private AuthenticationHandler authenticationHandler;

    public void setAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    public boolean logIn(String email, String password) {
        if (authenticationHandler.check(email, password)) {
            System.out.println("Authentication success!");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isPasswordValid(String email, String password) {
        return users.get(email).equals(password);
    }

}
