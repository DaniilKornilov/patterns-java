package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getPrice());

        Pizza baconTopping = new BaconToppingPizza(pizza);
        System.out.println(baconTopping.getPrice());

        Pizza cheeseTopping = new CheeseToppingPizza(pizza);
        System.out.println(cheeseTopping.getPrice());
    }
}
