package pl.michau.music;

public class StereoSystem {
    public static void main(String[] args) {

        Song[] songsLibrary = new Song[3];
        songsLibrary[0] = new Song("Michael Jackson", "Beat It", "Thriller");
        songsLibrary[1] = new Song("Popek", "Wyprawa do kasyna", "Gang Albanii");
        songsLibrary[2] = new Song("Zenek Martyniuk", "Przez twe oczy zielone", "Disco Hits 2016");

        Player[] players = {new CDPlayer(songsLibrary), new MP3Player(songsLibrary)};

        players[0].musicPlay();
        players[0].musicStop();
        players[0].nextSong();
        players[0].musicPlay();
        players[0].musicPause();
        players[0].musicPlay();
        players[0].previousSong();
        players[0].musicStop();
    }

}
