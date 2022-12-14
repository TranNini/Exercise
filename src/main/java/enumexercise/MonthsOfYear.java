package enumexercise;

public enum MonthsOfYear {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    private final int monthsInNumber;
    MonthsOfYear(int monthsInNumber) {
        this.monthsInNumber = monthsInNumber;
    }

    public int getMonthsInNumber() {
        return monthsInNumber;
    }
}
