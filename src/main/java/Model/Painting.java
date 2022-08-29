package Model;

public class Painting {
    String title;
    int year;
    String artist;

    public Painting(String title, int year, String artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist='" + artist + '\'' +
                '}';
    }
}
