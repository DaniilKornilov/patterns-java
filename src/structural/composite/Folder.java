package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {

    private final List<Component> components = new ArrayList<>();

    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void search(String keyword) {
        String message = String.format("Searching recursively for keyword %s in folder %s", keyword, name);
        System.out.println(message);
        for (Component component : components) {
            component.search(keyword);
        }
    }

    public void add(Component component) {
        components.add(component);
    }
}
