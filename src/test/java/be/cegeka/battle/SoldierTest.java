package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name", Weapon.BAREFIST);

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null, Weapon.BAREFIST);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("", Weapon.BAREFIST);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ", Weapon.BAREFIST);
    }

    @Test
    public void soldier_hasWeapon() throws Exception {
        Soldier soldier = new Soldier("Techno Viking");

        Assertions.assertThat(soldier.getWeapon()).isNotNull();
    }
    @Test
    public void soldier_hasBareFistByDefault() throws Exception {
        Soldier soldier = new Soldier("Techno Viking");

        Assertions.assertThat(soldier.getWeapon()).isEqualTo(Weapon.BAREFIST);
    }
    @Test
    public void attacker_canWin(){
        Soldier attacker = new Soldier("Techno Viking",Weapon.AXE);
        Soldier defender = new Soldier("Friday",Weapon.BAREFIST);

        Soldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(attacker);

    }
    @Test
    public void defender_canWin(){
        Soldier defender = new Soldier("Techno Viking",Weapon.AXE);
        Soldier attacker = new Soldier("Friday",Weapon.BAREFIST);

        Soldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(defender);
    }
    @Test
    public void attacker_winsInDraw(){
        Soldier attacker = new Soldier("Techno Viking",Weapon.AXE);
        Soldier defender = new Soldier("Friday",Weapon.AXE);

        Soldier winner = attacker.attack(defender);

        assertThat(winner).isEqualTo(attacker);
    }

}