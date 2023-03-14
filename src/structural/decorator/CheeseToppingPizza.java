package structural.decorator;

public class CheeseToppingPizza implements Pizza {

    private final Pizza pizza;

    public CheeseToppingPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }

}
