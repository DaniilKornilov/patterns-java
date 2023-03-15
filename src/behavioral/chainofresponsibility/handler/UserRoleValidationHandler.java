package behavioral.chainofresponsibility.handler;

import static behavioral.chainofresponsibility.Credentials.ADMIN_EMAIL;

public class UserRoleValidationHandler extends AuthenticationHandler {

    public boolean check(String email, String password) {
        if (email.equals(ADMIN_EMAIL)) {
            System.out.println("Hello, admin!");
            return checkNext(email, password);
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }

}
