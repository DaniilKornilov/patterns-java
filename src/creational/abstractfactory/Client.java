package creational.abstractfactory;

import creational.abstractfactory.factory.ArmyFactory;
import creational.abstractfactory.product.Navy;
import creational.abstractfactory.product.Soldier;

public class Client {

    private Soldier soldier;

    private Navy navy;

    public void createArmy(ArmyFactory armyFactory) {
        soldier = armyFactory.createSoldier();
        navy = armyFactory.createNavy();
    }

    public String getSoldier() {
        return soldier.getName();
    }

    public String getNavy() {
        return navy.getName();
    }
}
