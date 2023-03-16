package creational.factorymethod;

import creational.factorymethod.button.ButtonType;
import creational.factorymethod.dialogwindow.DialogWindow;
import creational.factorymethod.dialogwindow.MacDialogWindow;
import creational.factorymethod.dialogwindow.WindowsDialogWindow;

public class Main {

    public static void main(String[] args) {
        DialogWindow dialogWindow = createDialogWindow(ButtonType.MAC);
        dialogWindow.clickButton();

        dialogWindow = createDialogWindow(ButtonType.WINDOWS);
        dialogWindow.clickButton();
    }

    private static DialogWindow createDialogWindow(ButtonType buttonType) {
        switch (buttonType) {
            case MAC -> {
                return new MacDialogWindow();
            }
            case WINDOWS -> {
                return new WindowsDialogWindow();
            }
            default -> throw new IllegalArgumentException("No such button type!");
        }

    }

}
