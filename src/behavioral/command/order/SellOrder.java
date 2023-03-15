package behavioral.command.order;

import behavioral.command.StockMarket;

public class SellOrder implements Order {

    private final StockMarket stockMarket;

    public SellOrder(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    @Override
    public void execute() {
        stockMarket.sell();
    }

}
