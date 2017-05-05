package be.cegeka.battle;

/**
 * Created by roel on 05.05.17.
 */
public class Weapon {
    public final static Weapon AXE = new Weapon(3);
    public final static Weapon SWORD= new Weapon(2);
    public final static Weapon SPEAR= new Weapon(2);
    public final static Weapon BAREFIST= new Weapon(1);


    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
