package dnd;

public class Dnd {

    public static void main(String[] args) {

//        System.out.println(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST) + "\n");

        Fighter fighter = new Fighter();
        fighter.setCharisma(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setArmorClass(10);
        fighter.setConstitution(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setDexterity(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setIntelligence(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setStrength(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setWisdom(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        fighter.setName("Jan");
        fighter.setRace("Human");
        fighter.setLevel(1);
        fighter.setHitPoints(10);

        System.out.println("Fighter " + fighter);
        System.out.println("3d6 + modifier = " + DieUtil.rollD6(2));
        System.out.println("3d20 + modifier = " + DieUtil.rollD20(2) + "\n");

        Druid druid = new Druid();
        druid.setCharisma(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setArmorClass(10);
        druid.setConstitution(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setDexterity(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setIntelligence(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setStrength(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setWisdom(DieUtil.roll(Die.D6, 4, RollOption.DROP_LOWEST));
        druid.setName("Jan");
        druid.setRace("Human");
        druid.setLevel(1);
        druid.setHitPoints(10);


        System.out.println("Druid " + druid);
        System.out.println("3d6 + modifier = " + DieUtil.rollD6(2));
        System.out.println("3d20 + modifier = " + DieUtil.rollD20(2));

    }

}
