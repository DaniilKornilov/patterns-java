package behavioral.mediator;

import behavioral.mediator.armedunit.Soldier;
import behavioral.mediator.armedunit.Tank;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        String tankId = "1";
        String soldierId = "2";
        Tank tank = new Tank(tankId, commander);
        Soldier soldier = new Soldier(soldierId, commander);

        commander.setArmedUnits(List.of(soldier, tank));
        commander.startAttack(tankId);
        commander.startAttack(soldierId);
        commander.stopAttack(tankId);
        commander.startAttack(soldierId);
    }

}
