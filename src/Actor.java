import java.util.Objects;

public class Actor extends Person {


    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }


    @Override
    public int hashCode() {
        int hash = 31;
        if (getName() != null) {
            hash += getName().hashCode();

        }
        hash *= 31;
        if (getSurname() != null) {
            hash += getSurname().hashCode();

        }
        hash += getHeight();
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
        return Objects.equals(getName(), anotherActor.getName()) && Objects.equals(getSurname(), anotherActor.getSurname())
                && (getHeight() == anotherActor.getHeight());

    }

    @Override
    public String toString() {
        return getName() +
                " " + getSurname() +
                "(" + getHeight() + ")";
    }

}