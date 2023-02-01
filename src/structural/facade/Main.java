package structural.facade;

import structural.facade.service.OrderServiceFacade;
import structural.facade.service.OrderServiceFacadeImpl;

public class Main {

    public static void main(String[] args) {
        OrderServiceFacade orderService = new OrderServiceFacadeImpl();
        orderService.placeOrder("Cage");
    }
}
