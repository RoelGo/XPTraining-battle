package be.cegeka.battle;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Army {

    private List<Soldier> troops = newArrayList();

    public List<Soldier> getTroops() {
        return troops;
    }

    public void addTroops(Soldier soldier) {
        troops.add(soldier);
    }

    public Soldier getFrontMan() {
        return troops.get(0);
    }


}
