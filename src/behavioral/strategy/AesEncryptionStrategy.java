package behavioral.strategy;

public class AesEncryptionStrategy extends BaseEncryptionStrategy {

    private static final String ALGORITHM = "AES";

    @Override
    protected String getAlgorithm() {
        return ALGORITHM;
    }

}
