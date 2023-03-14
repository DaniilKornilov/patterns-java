package structural.composite;

public record File(String name) implements Component {

    @Override
    public void search(String keyword) {
        String message = String.format("Searching for keyword %s in file %s", keyword, name);
        System.out.println(message);
    }

}
