package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
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

}