package be.cegeka.battle;

public class FightingSoldier {

    private final Soldier soldier;
    private final Army army;

    public FightingSoldier(Soldier soldier, Army army) {

        this.soldier = soldier;
        this.army = army;
    }


    public FightingSoldier attack(FightingSoldier defender) {
        if(attackerWins(defender)){
            return this;
        }
        return defender;
    }

    private boolean attackerWins(FightingSoldier defender) {
        return this.getWeaponDamage() >= defender.getWeaponDamage();
    }

    private int getWeaponDamage() {
        return this.soldier.getWeaponDamage();
    }


}
