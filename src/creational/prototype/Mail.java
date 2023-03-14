package creational.prototype;

public record Mail(String text) implements Cloneable {

    public Mail {
        if (text == null) {
            throw new IllegalArgumentException("Text can't be null!");
        }
    }

    @Override
    public Mail clone() {
        try {
            return (Mail) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException("Object can't be cloned");
        }

    }

}
