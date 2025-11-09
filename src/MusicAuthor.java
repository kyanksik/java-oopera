public class MusicAuthor extends Person {
    private int songsCount;

    public MusicAuthor(String name, String surname, Gender gender, int height, int songsCount) {
        super(name, surname, gender, height);
        this.songsCount = songsCount;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public void setSongsCount(int songsCount) {
        this.songsCount = songsCount;
    }
}
