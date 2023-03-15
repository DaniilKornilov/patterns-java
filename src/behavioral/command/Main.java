package behavioral.command;

import behavioral.command.order.BuyOrder;
import behavioral.command.order.Order;
import behavioral.command.order.SellOrder;

public class Main {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Order buyOrder = new BuyOrder(stockMarket);
        Order sellOrder = new SellOrder(stockMarket);

        Broker broker = new Broker();
        broker.placeOrder(buyOrder);
        broker.placeOrder(sellOrder);

        broker.executeOrders();
    }

}
