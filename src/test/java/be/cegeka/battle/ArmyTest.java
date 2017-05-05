package be.cegeka.battle;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    Army army;

    @Before
    public void setUp() {

        army = new Army();
    }

    @Test
    public void anArmyHasSoldiers() throws Exception {
        assertThat(army.getTroops()).isNotNull();
    }

    @Test
    public void enroleSoldierInTheArmyTest() throws Exception {
        Soldier soldier = new Soldier("Soldier76");
        army.addTroops(soldier);
        assertThat(army.getTroops()).contains(soldier);
    }

    @Test
    public void firstAddedSoldierIsFrontMan() throws Exception {
        Soldier soldier = new Soldier("one");
        Soldier soldier1 = new Soldier("two");
        Soldier soldier2 = new Soldier("three");
        army.addTroops(soldier);
        army.addTroops(soldier1);
        army.addTroops(soldier2);

        assertThat(army.getFrontMan()).isEqualTo(soldier);

    }
}
