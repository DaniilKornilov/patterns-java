package structural.facade;

public class Main {

    public static void main(String[] args) {
        OrderServiceFacade orderService = new OrderServiceFacadeImpl();
        orderService.placeOrder("Cage");
    }
}
