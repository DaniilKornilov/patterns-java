package behavioral.mediator;

import behavioral.mediator.armedunit.ArmedUnit;

import java.util.List;

public interface Commander {

    void setArmedUnits(List<ArmedUnit> armedUnits);

    void startAttack(String id);

    void stopAttack(String id);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

}
