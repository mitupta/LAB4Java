package pl.michau.music;

public class Song {

    private String artist, title, album;

    public Song(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song" +
                "| Artist:" + artist + '\'' +
                "| Title: " + title + '\'' +
                "| Album: " + album + '\'' +
                '.';
    }
}
