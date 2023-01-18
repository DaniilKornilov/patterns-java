package creational.abstractfactory.product;

public class Legionnaire extends Soldier {

    private static final String LEGIONNAIRE_NAME = "Legionnaire";

    @Override
    public String getName() {
        return LEGIONNAIRE_NAME;
    }
}
