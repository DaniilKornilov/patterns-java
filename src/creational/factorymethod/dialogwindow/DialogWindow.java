package creational.factorymethod.dialogwindow;

import creational.factorymethod.button.Button;

public abstract class DialogWindow {

    public void clickButton() {
        Button button = createButton();
        button.click();
    }

    public abstract Button createButton();

}
