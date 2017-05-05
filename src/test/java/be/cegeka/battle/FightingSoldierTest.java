package be.cegeka.battle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class FightingSoldierTest {

    Soldier viking;
    Soldier friday;
    private Army vikings;
    private Army teamFriday;


    @Before
    public void setUp() throws Exception {
        viking = new Soldier("Techno Viking", Weapon.AXE);
        friday = new Soldier("Friday", Weapon.BAREFIST);

        vikings = new Army();
        teamFriday = new Army();

        vikings.addTroops(viking);
        teamFriday.addTroops(friday);
    }

    @Test
    public void attacker_canWin() {
        FightingSoldier attacker = new FightingSoldier(viking,vikings);
        FightingSoldier defender = new FightingSoldier(friday,teamFriday);

        FightingSoldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(attacker);

    }

    @Test
    public void defender_canWin() {
        FightingSoldier attacker = new FightingSoldier(friday,teamFriday);
        FightingSoldier defender = new FightingSoldier(viking,vikings);

        FightingSoldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(defender);
    }

    @Test
    public void attacker_winsInDraw() {
        viking = new Soldier("Techno Viking", Weapon.BAREFIST);
        friday = new Soldier("Friday", Weapon.BAREFIST);

        vikings = new Army();
        teamFriday = new Army();

        vikings.addTroops(viking);
        teamFriday.addTroops(friday);

        FightingSoldier attacker = new FightingSoldier(viking,vikings);
        FightingSoldier defender = new FightingSoldier(friday,teamFriday);

        FightingSoldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(attacker);
    }

    @Test
    public void losingDefenderShouldBeDeleted() throws Exception {
        FightingSoldier attacker = new FightingSoldier(viking,vikings);
        FightingSoldier defender = new FightingSoldier(friday,teamFriday);

        attacker.attack(defender);

        assertThat(teamFriday.getTroops()).doesNotContain(friday);
    }
    @Test
    public void loserShouldBeDeleted() throws Exception {
        FightingSoldier attacker = new FightingSoldier(friday,teamFriday);
        FightingSoldier defender = new FightingSoldier(viking,vikings);

        attacker.attack(defender);

        assertThat(teamFriday.getTroops()).doesNotContain(friday);
    }
}