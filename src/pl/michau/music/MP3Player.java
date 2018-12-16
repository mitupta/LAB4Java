package pl.michau.music;

public class MP3Player extends MusicPlayer implements Player{


    public MP3Player(Song[] songsLibrary) {
        super(songsLibrary);
    }

    @Override
    public void musicPlay() {
        System.out.println("MP3 play " + getCurrentSong());
    }

    @Override
    public void musicPause() {
        System.out.println("MP3 pause music");
    }

    @Override
    public void musicStop() {
        System.out.println("MP3 stop music");
    }


}
