package behavioral.strategy;

public class BlowfishEncryptionStrategy extends BaseEncryptionStrategy {

    private static final String ALGORITHM = "Blowfish";

    @Override
    protected String getAlgorithm() {
        return ALGORITHM;
    }

}
