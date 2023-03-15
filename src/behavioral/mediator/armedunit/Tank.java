package behavioral.mediator.armedunit;

import behavioral.mediator.Commander;

public class Tank extends ArmedUnit {

    public Tank(String id, Commander commander) {
        super(id, commander);
    }

    @Override
    protected String getUnitName() {
        return "Tank";
    }

}
