package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.Server;

public class UserValidationHandler extends AuthenticationHandler {

    private final Server server;

    public UserValidationHandler(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("User is not registered!");
            return false;
        }
        if (!server.isPasswordValid(email, password)) {
            System.out.println("Invalid password!");
            return false;
        }
        return checkNext(email, password);
    }

}
