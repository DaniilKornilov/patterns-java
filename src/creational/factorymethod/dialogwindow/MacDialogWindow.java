package creational.factorymethod.dialogwindow;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.MacButton;

public class MacDialogWindow extends DialogWindow {

    @Override
    public Button createButton() {
        return new MacButton();
    }

}
