package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon = Weapon.BAREFIST;


    public Soldier(String name, Weapon weapon) {
        Validate.isTrue(isNotBlank(name));
        this.weapon = weapon;
        this.name = name;
    }

    public Soldier(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getWeaponDamage() {
        return this.getWeapon().getDamage();
    }
}
