public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
