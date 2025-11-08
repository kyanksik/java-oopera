public class MusicAuthor extends Person {
    public int songsCount;

    public MusicAuthor(String name, String surname, Gender gender, int height, int songsCount) {
        super(name, surname, gender, height);
        this.songsCount = songsCount;
    }
}
