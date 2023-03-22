package behavioral.strategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public abstract class BaseEncryptionStrategy implements EncryptionStrategy {

    @Override
    public void encryptData(String data) {
        String algorithm = getAlgorithm();
        System.out.println(algorithm);
        System.out.println("Original data: " + data);
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plaintTextByteArray = data.getBytes(StandardCharsets.UTF_8);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plaintTextByteArray);
            System.out.println("Encrypted data: " + new String(cipherText, StandardCharsets.UTF_8));
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    protected abstract String getAlgorithm();

}
