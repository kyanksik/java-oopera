public class Choreographer extends Person {
    private int dancesKnown;

    public Choreographer(String name, String surname, Gender gender, int height, int dancesKnown) {
        super(name, surname, gender, height);
        this.dancesKnown = dancesKnown;
    }

    public int getDancesKnown() {
        return dancesKnown;
    }

    public void setDancesKnown(int dancesKnown) {
        this.dancesKnown = dancesKnown;
    }
}
