package be.cegeka.battle;

/**
 * Created by roel on 05.05.17.
 */
public enum Weapon {
    AXE (3),
    SWORD(2),
    SPEAR(2),
    BAREFIST(1);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
