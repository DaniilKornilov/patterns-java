package creational.factorymethod.dialogwindow;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.WindowsButton;

public class WindowsDialogWindow extends DialogWindow {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
