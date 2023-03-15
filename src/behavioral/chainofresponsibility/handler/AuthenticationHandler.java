package behavioral.chainofresponsibility.handler;

import java.util.List;

public abstract class AuthenticationHandler {

    private AuthenticationHandler nextHandler;

    public static AuthenticationHandler link(List<AuthenticationHandler> chain) {
        AuthenticationHandler first = chain.get(0);
        AuthenticationHandler currentHandler = first;

        for (AuthenticationHandler nextInChain : chain) {
            currentHandler.nextHandler = nextInChain;
            currentHandler = nextInChain;
        }
        return first;
    }

    protected boolean checkNext(String email, String password) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.check(email, password);
    }

    public abstract boolean check(String email, String password);

}
