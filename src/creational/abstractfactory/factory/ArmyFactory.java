package creational.abstractfactory.factory;

import creational.abstractfactory.product.Navy;
import creational.abstractfactory.product.Soldier;

public abstract class ArmyFactory {

    public abstract Soldier createSoldier();

    public abstract Navy createNavy();

}
