package dnd;

public class Druid extends Character {

    public int getToAttack() {
        return ((getStrength() - 10) /2) + getProficencyBonus();
    }

}
