package dnd;

public class Dnd {

    public static void main(String[] args) {

        Fighter fighter = new Fighter();
        fighter.setCharisma(DieUtil.roll3d6());
        fighter.setArmorClass(10);
        fighter.setConstitution(DieUtil.roll3d6());
        fighter.setDexterity(DieUtil.roll3d6());
        fighter.setIntelligence(DieUtil.roll3d6());
        fighter.setStrength(DieUtil.roll3d6());
        fighter.setWisdom(DieUtil.roll3d6());
        fighter.setName("Jan");
        fighter.setRace("Human");
        fighter.setLevel(1);
        fighter.setHitPoints(10);

        System.out.println(fighter);
        System.out.println("3d6 + modifier = " + DieUtil.rollD6(2));
        System.out.println("3d20 + modifier = " + DieUtil.rollD20(2));

    }

}
