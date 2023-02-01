package structural.decorator;

public class BaconToppingPizza implements Pizza {

    private final Pizza pizza;

    public BaconToppingPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 10;
    }
}
