package be.cegeka.battle;


import org.junit.Before;
import org.junit.Test;

public class WarTest {

    private War war;
    private Soldier soldier,soldier1,soldier2,soldier3;
    private Army germanArmy, army1;

    @Before
    public void setUp() throws Exception {
        soldier = new Soldier("Roel");
        soldier1 = new Soldier("Rodrigo");
        soldier2 = new Soldier("William");
        soldier3 = new Soldier ("Thomas");

        germanArmy.addTroops(soldier1);
        germanArmy.addTroops(soldier2);
        germanArmy.addTroops(soldier);
        germanArmy.addTroops(soldier3);

        army1.addTroops(soldier3);
        army1.addTroops(soldier2);
        army1.addTroops(soldier1);
        army1.addTroops(soldier);

    }

    @Test
    public void ArmiesEngageInWar() throws Exception {

    }
}
