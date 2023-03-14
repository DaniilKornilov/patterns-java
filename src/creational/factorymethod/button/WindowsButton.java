package creational.factorymethod.button;

public class WindowsButton extends Button {

    private static final String OS_TYPE = "Windows";

    @Override
    public void click() {
        System.out.println(OS_TYPE + " " + BUTTON_CLICK);
    }

}
