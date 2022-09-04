import java.util.Random;

public class Dnd {

    public static void main(String[] args) {

        Fighter fighter = new Fighter();
        fighter.setCharisma(Die.roll3d6());
        fighter.setArmorClass(10);
        fighter.setConstitution(Die.roll3d6());
        fighter.setDexterity(Die.roll3d6());
        fighter.setIntelligence(Die.roll3d6());
        fighter.setStrength(Die.roll3d6());
        fighter.setWisdom(Die.roll3d6());
        fighter.setName("Jan");
        fighter.setRace("Human");
        fighter.setLevel(1);
        fighter.setHitPoints(10);

        System.out.println(fighter);
        System.out.println(Die.rollD6(2));


    }

}
