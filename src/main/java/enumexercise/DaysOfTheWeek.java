package enumexercise;

public enum DaysOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayInNumber;
    DaysOfTheWeek(int dayInNumber) {
        this.dayInNumber = dayInNumber;
    }

    public int getDayInNumber() {
        return dayInNumber;
    }
}
