public class Choreographer extends Person {
    public int dancesKnown;

    public Choreographer(String name, String surname, Gender gender, int height, int dancesKnown) {
        super(name, surname, gender, height);
        this.dancesKnown = dancesKnown;
    }
}