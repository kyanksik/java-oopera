import java.util.Objects;

public class Actor extends Person {


    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }


    @Override
    public int hashCode() {
        int hash = 31;
        if (name != null) {
            hash += name.hashCode();

        }
        hash *= 31;
        if (surname != null) {
            hash += surname.hashCode();

        }
        hash += height;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Actor anotherActor = (Actor) obj;
        return Objects.equals(name, anotherActor.name) && Objects.equals(surname, anotherActor.surname)
                && (height == anotherActor.height);

    }

    @Override
    public String toString() {
        return name +
                " " + surname +
                "(" + height + ")";
    }

}