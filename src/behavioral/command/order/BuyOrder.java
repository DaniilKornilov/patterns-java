package behavioral.command.order;

import behavioral.command.StockMarket;

public class BuyOrder implements Order {

    private final StockMarket stockMarket;

    public BuyOrder(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    @Override
    public void execute() {
        stockMarket.buy();
    }

}
