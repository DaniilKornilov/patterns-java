package creational.factorymethod;

import creational.factorymethod.creator.ButtonCreator;
import creational.factorymethod.creator.MacButtonCreator;
import creational.factorymethod.creator.WindowsButtonCreator;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        ButtonCreator buttonCreator = new MacButtonCreator();
        client.createButton(buttonCreator);
        client.getButton().click();

        buttonCreator = new WindowsButtonCreator();
        client.createButton(buttonCreator);
        client.getButton().click();
    }

}
