package be.cegeka.battle;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {


    private Soldier technoViking,soldier1,soldier2,soldier3;
    private Army germanArmy, allied;


    @Before
    public void setUp() throws Exception {
        technoViking = new Soldier("Techno Roel Viking", new Axe(20));
        soldier1 = new Soldier("Rodrigo", Weapon.BAREFIST);
        soldier2 = new Soldier("William", Weapon.SWORD);
        soldier3 = new Soldier ("Thomas", Weapon.SPEAR);

        germanArmy = new Army();
        allied = new Army();

        germanArmy.addTroops(technoViking);
        germanArmy.addTroops(soldier1);
        germanArmy.addTroops(soldier2);
        germanArmy.addTroops(soldier3);

        allied.addTroops(soldier3);
        allied.addTroops(soldier2);
        allied.addTroops(soldier1);

    }


    @Test
    public void anArmyHasSoldiers() throws Exception {
        assertThat(germanArmy.getTroops()).isNotNull();
    }

    @Test
    public void enroleSoldierInTheArmyTest() throws Exception {
        Soldier soldier = new Soldier("Soldier76");
        germanArmy.addTroops(soldier);
        assertThat(germanArmy.getTroops()).contains(soldier);
    }

    @Test
    public void firstAddedSoldierIsFrontMan() throws Exception {

        assertThat(germanArmy.getFrontMan()).isEqualTo(technoViking);

    }
}
