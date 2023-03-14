package creational.factorymethod.creator;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.MacButton;

public class MacButtonCreator extends ButtonCreator {

    @Override
    public Button createButton() {
        return new MacButton();
    }

}
