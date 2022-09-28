package game;

public enum ChoiceInNumber {
    ROCK (1),
    PAPER (2),
    SCISSORS (3);

    int choiceNumber;

    ChoiceInNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;}

    public int getChoiceNumber () {
        return choiceNumber;
    }
}
