package creational.factorymethod.creator;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.WindowsButton;

public class WindowsButtonCreator extends ButtonCreator {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
