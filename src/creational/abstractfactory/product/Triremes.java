package creational.abstractfactory.product;

public class Triremes extends Navy {

    private static final String TRIREMES_NAME = "Triremes";

    @Override
    public String getName() {
        return TRIREMES_NAME;
    }
}
