import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor batman = new Actor("Рой", "Джонс", Gender.MALE, 170);
        Actor catWoman = new Actor("Галя", "Цой", Gender.FEMALE, 160);
        Actor superman = new Actor("Боря", "Барс", Gender.MALE, 177);

        Director mainDirector = new Director("Кельвин", "Харрис", Gender.MALE, 175, 8);
        Director supportDirector = new Director("Питер", "Паркер", Gender.MALE, 180, 5);

        MusicAuthor musicAuthor = new MusicAuthor("Виктория", "Боня", Gender.FEMALE, 160, 30);
        Choreographer choreographer = new Choreographer("Василий", "Танцор", Gender.MALE, 180, 12);

        ArrayList<Actor> actorsInShow = new ArrayList<>();
        Show standartShow = new Show("Грязные времена", 60, mainDirector, actorsInShow);
        standartShow.addActorToShow(batman);
        standartShow.addActorToShow(catWoman);
        standartShow.addActorToShow(superman);

        ArrayList<Actor> actorsInOpera = new ArrayList<>();
        Opera opera = new Opera("Вредно не мечтать", 90, mainDirector, actorsInOpera, musicAuthor, "Лучшая опера и это либретто!", 12);
        opera.addActorToShow(catWoman);
        opera.addActorToShow(superman);

        ArrayList<Actor> actorsInBallet = new ArrayList<>();
        Ballet ballet = new Ballet("Красивые дали", 75, supportDirector, actorsInBallet, musicAuthor, "Лучший балет и это либретто!", choreographer);
        ballet.addActorToShow(batman);
        ballet.addActorToShow(superman);


        standartShow.printAllActorsInShow();

        opera.printAllActorsInShow();

        ballet.printAllActorsInShow();

        ballet.changeActorInShow(catWoman, "Джонс");

        ballet.printAllActorsInShow();

        opera.changeActorInShow(batman, "Фролов");

        opera.printLibretto();
        ballet.printLibretto();
    }
}