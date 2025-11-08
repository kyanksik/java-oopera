import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printAllActorsInShow() {
        if (listOfActors.isEmpty()) {
            System.out.println("На шоу еще не назначены актеры");
            return;
        }
        System.out.println("Список актеров в данном шоу:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorToShow(Actor actor) {
        for (Actor actorInList : listOfActors) {
            if (actorInList.equals(actor)) {
                System.out.println("Данный актер уже находится в списке!");
                return;

            }
        }
        listOfActors.add(actor);
        System.out.println("Актер Добавлен");

    }

    public void changeActorInShow(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, actor);
                System.out.println("Актер успешно заменен");
                return;
            }

        }
        System.out.println("Такого актера нет в списке");
    }
}
