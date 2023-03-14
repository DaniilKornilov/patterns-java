package creational.abstractfactory.factory;

import creational.abstractfactory.product.Hoplite;
import creational.abstractfactory.product.Navy;
import creational.abstractfactory.product.Soldier;
import creational.abstractfactory.product.Triremes;

public class GreekArmyFactory extends ArmyFactory {

    @Override
    public Soldier createSoldier() {
        return new Hoplite();
    }

    @Override
    public Navy createNavy() {
        return new Triremes();
    }

}
