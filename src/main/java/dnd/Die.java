package dnd;

public enum Die {
    D4(4, "4 sided die"),
    D6(6, "6 sided die"),
    D8(8, "8 sided die"),
    D10(10, "10 sided die"),
    D12(12, "12 sided die"),
    D20(20, "20 sided die"),
    D100(100, "100 sided die");

    int sides;
    String name;

    Die(int sides, String name) {
        this.sides = sides;
        this.name = name;
    }
}
