package creational.factorymethod.button;

public class MacButton extends Button {

    private static final String OS_TYPE = "Mac";

    @Override
    public void click() {
        System.out.println(OS_TYPE + " " + BUTTON_CLICK);
    }

}
