package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handler.AuthenticationHandler;
import behavioral.chainofresponsibility.handler.ThrottlingHandler;
import behavioral.chainofresponsibility.handler.UserRoleValidationHandler;
import behavioral.chainofresponsibility.handler.UserValidationHandler;

import java.util.List;

import static behavioral.chainofresponsibility.Credentials.ADMIN_EMAIL;
import static behavioral.chainofresponsibility.Credentials.ADMIN_PASSWORD;
import static behavioral.chainofresponsibility.Credentials.USER_EMAIL;
import static behavioral.chainofresponsibility.Credentials.USER_PASSWORD;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        server.register(ADMIN_EMAIL, ADMIN_PASSWORD);
        server.register(USER_EMAIL, USER_PASSWORD);

        AuthenticationHandler authenticationHandler = AuthenticationHandler.link(List.of(
                new ThrottlingHandler(3),
                new UserValidationHandler(server),
                new UserRoleValidationHandler()));
        server.setAuthenticationHandler(authenticationHandler);

        boolean isLoginSuccess = server.logIn(ADMIN_EMAIL, ADMIN_PASSWORD);
        System.out.println("Admin login: " + isLoginSuccess);

        isLoginSuccess = server.logIn(USER_EMAIL, USER_PASSWORD);
        System.out.println("User login: " + isLoginSuccess);

        isLoginSuccess = server.logIn(ADMIN_EMAIL, USER_PASSWORD);
        System.out.println("Invalid login and password: " + isLoginSuccess);

        isLoginSuccess = server.logIn(ADMIN_EMAIL, USER_PASSWORD);
        System.out.println("Request limit exceeded : " + isLoginSuccess);
    }

}
