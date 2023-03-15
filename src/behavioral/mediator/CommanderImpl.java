package behavioral.mediator;

import behavioral.mediator.armedunit.ArmedUnit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommanderImpl implements Commander {

    private Map<String, ArmedUnit> idToArmedUnit = new HashMap<>();

    private boolean attackStatus = true;

    @Override
    public void setArmedUnits(List<ArmedUnit> armedUnits) {
        this.idToArmedUnit = armedUnits.stream()
                .collect(Collectors.toMap(ArmedUnit::getId,
                        Function.identity(),
                        (existing, replacement) -> replacement));
    }

    @Override
    public void startAttack(String id) {
        ArmedUnit armedUnit = idToArmedUnit.get(id);
        armedUnit.startAttack();
    }

    @Override
    public void stopAttack(String id) {
        ArmedUnit armedUnit = idToArmedUnit.get(id);
        armedUnit.stopAttack();
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

}
