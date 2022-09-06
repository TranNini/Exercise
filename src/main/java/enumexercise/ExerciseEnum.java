package enumexercise;

public class ExerciseEnum {
    public static void main(String[] args) {
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
           // System.out.printf("%s: %s%n", day, day.getDayInNumber());
            System.out.println(day.toString() + " " + day.getDayInNumber());
        }

//        DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
//        if (day == DaysOfTheWeek.FRIDAY) {
//            System.out.println("It's finally weekend!");
//        }
//        System.out.println(DaysOfTheWeek.MONDAY.dayInNumber);
    }
}
