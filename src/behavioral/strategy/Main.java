package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        EncryptionStrategy encryptionStrategy = new AesEncryptionStrategy();
        String data = "data";
        Encryptor encryptor = new Encryptor(encryptionStrategy, data);
        encryptor.encrypt();

        encryptionStrategy = new BlowfishEncryptionStrategy();
        encryptor = new Encryptor(encryptionStrategy, data);
        encryptor.encrypt();
    }

}
