package be.cegeka.battle;

public class FightingSoldier {

    private final Soldier soldier;
    private final Army army;

    public FightingSoldier(Soldier soldier, Army army) {

        this.soldier = soldier;
        this.army = army;
    }

    public Army getArmy() {
        return army;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void killSoldier() {
        army.killedInAction(soldier);
    }


    public FightingSoldier attack(FightingSoldier defender) {
        if (attackerWins(defender)) {
            defender.killSoldier();
            return this;
        }
        this.killSoldier();
        return defender;
    }

    private boolean attackerWins(FightingSoldier defender) {
        return this.getWeaponDamage() >= defender.getWeaponDamage();
    }

    private int getWeaponDamage() {
        return this.soldier.getWeaponDamage();
    }


}
