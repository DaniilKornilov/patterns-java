package creational.abstractfactory;

import creational.abstractfactory.factory.ArmyFactory;
import creational.abstractfactory.factory.GreekArmyFactory;
import creational.abstractfactory.factory.RomanArmyFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        ArmyFactory armyFactory = new GreekArmyFactory();
        client.createArmy(armyFactory);
        printClientInfo(client);

        armyFactory = new RomanArmyFactory();
        client.createArmy(armyFactory);
        printClientInfo(client);
    }

    private static void printClientInfo(Client client) {
        System.out.println(client.getNavy());
        System.out.println(client.getSoldier());
    }
}
