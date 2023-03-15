package behavioral.mediator.armedunit;

import behavioral.mediator.Commander;

public abstract class ArmedUnit {

    private final String id;

    private final Commander commander;

    public ArmedUnit(String id, Commander commander) {
        this.id = id;
        this.commander = commander;
    }

    public void startAttack() {
        if (commander.canAttack()) {
            System.out.println(getUnitName() + " started attack");
            commander.setAttackStatus(false);
        } else {
            System.out.println(getUnitName() + " can't attack. Other unit is attacking");
        }
    }

    protected abstract String getUnitName();

    public void stopAttack() {
        System.out.println(getUnitName() + " stopped attack");
        commander.setAttackStatus(true);
    }

    public String getId() {
        return id;
    }

}
