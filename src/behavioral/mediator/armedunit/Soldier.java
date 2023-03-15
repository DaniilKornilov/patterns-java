package behavioral.mediator.armedunit;

import behavioral.mediator.Commander;

public class Soldier extends ArmedUnit {

    public Soldier(String id, Commander commander) {
        super(id, commander);
    }

    @Override
    protected String getUnitName() {
        return "Soldier";
    }

}
