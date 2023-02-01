package structural.decorator;

public class BasicPizza implements Pizza {

    @Override
    public int getPrice() {
        return 10;
    }
}
