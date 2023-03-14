package creational.factorymethod;

import creational.factorymethod.button.Button;
import creational.factorymethod.creator.ButtonCreator;

public class Client {

    private Button button;

    public void createButton(ButtonCreator buttonCreator) {
        button = buttonCreator.createButton();
    }

    public Button getButton() {
        return button;
    }

}
