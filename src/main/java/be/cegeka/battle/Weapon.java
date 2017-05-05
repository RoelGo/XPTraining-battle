package be.cegeka.battle;

public abstract class Weapon {
    public final static Weapon AXE = new Axe(3);
    public final static Weapon SWORD= new Sword(2);
    public final static Weapon SPEAR= new Spear(2);
    public final static Weapon BAREFIST= new Barefist(1);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
