package behavioral.command;

import behavioral.command.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private final List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void executeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }

}
