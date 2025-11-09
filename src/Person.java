public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;
    private final int height;

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
