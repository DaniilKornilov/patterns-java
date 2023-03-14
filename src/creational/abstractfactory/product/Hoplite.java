package creational.abstractfactory.product;

public class Hoplite extends Soldier {

    private static final String HOPLITE_NAME = "Hoplite";

    @Override
    public String getName() {
        return HOPLITE_NAME;
    }

}
