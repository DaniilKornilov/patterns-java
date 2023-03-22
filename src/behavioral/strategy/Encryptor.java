package behavioral.strategy;

public class Encryptor {

    private final EncryptionStrategy strategy;

    private final String data;

    public Encryptor(EncryptionStrategy strategy, String data) {
        this.strategy = strategy;
        this.data = data;
    }

    public void encrypt() {
        strategy.encryptData(data);
    }

}
