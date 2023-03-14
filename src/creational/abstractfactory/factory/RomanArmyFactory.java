package creational.abstractfactory.factory;

import creational.abstractfactory.product.Legionnaire;
import creational.abstractfactory.product.LongShip;
import creational.abstractfactory.product.Navy;
import creational.abstractfactory.product.Soldier;

public class RomanArmyFactory extends ArmyFactory {

    @Override
    public Soldier createSoldier() {
        return new Legionnaire();
    }

    @Override
    public Navy createNavy() {
        return new LongShip();
    }

}
