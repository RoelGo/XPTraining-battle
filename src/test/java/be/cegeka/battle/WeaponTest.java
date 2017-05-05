package be.cegeka.battle;

import org.junit.Test;

import static be.cegeka.battle.Weapon.*;
import static org.assertj.core.api.Assertions.assertThat;


public class WeaponTest {
    @Test
    public void damageDoneByWeapons() throws Exception {
        assertThat(AXE.getDamage()).isEqualTo(3);
        assertThat(BAREFIST.getDamage()).isEqualTo(1);
        assertThat(SPEAR.getDamage()).isEqualTo(2);
        assertThat(SWORD.getDamage()).isEqualTo(2);
    }
}