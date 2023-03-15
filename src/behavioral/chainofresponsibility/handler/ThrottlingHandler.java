package behavioral.chainofresponsibility.handler;

public class ThrottlingHandler extends AuthenticationHandler {

    private final int requestsPerMinute;

    private int currentRequestNumber;

    private long currentTime;

    public ThrottlingHandler(int requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
    }

    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            currentRequestNumber = 0;
            currentTime = System.currentTimeMillis();
        }

        currentRequestNumber++;

        if (currentRequestNumber > requestsPerMinute) {
            System.out.println("Request limit exceeded!");
            return false;
        }
        return checkNext(email, password);
    }

}
