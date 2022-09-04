package dnd;

public class Fighter extends Character {
    public int getToAttack() {
        return ((getStrength() - 10) /2) + getProficencyBonus();
    }
}

