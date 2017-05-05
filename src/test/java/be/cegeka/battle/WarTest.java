package be.cegeka.battle;


import org.junit.Before;
import org.junit.Test;

public class WarTest {

    private War war;
    private Soldier soldier,soldier1,soldier2,soldier3;
    private Army germanArmy, allied;

    @Before
    public void setUp() throws Exception {
        soldier = new Soldier("Techno Roel Viking", new Axe(20));
        soldier1 = new Soldier("Rodrigo", Weapon.BAREFIST);
        soldier2 = new Soldier("William", Weapon.SWORD);
        soldier3 = new Soldier ("Thomas", Weapon.SPEAR);

        germanArmy.addTroops(soldier1);
        germanArmy.addTroops(soldier2);
        germanArmy.addTroops(soldier);
        germanArmy.addTroops(soldier3);

        allied.addTroops(soldier3);
        allied.addTroops(soldier2);
        allied.addTroops(soldier1);
        allied.addTroops(soldier);
    }

//    @Test
//    public void ArmiesEngageInWar() throws Exception {
//
//    }
}
