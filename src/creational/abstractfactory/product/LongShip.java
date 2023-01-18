package creational.abstractfactory.product;

public class LongShip extends Navy {

    private static final String LONG_SHIP_NAME = "Long ship";

    @Override
    public String getName() {
        return LONG_SHIP_NAME;
    }
}
