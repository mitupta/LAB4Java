package pl.michau.music;

public class CDPlayer extends MusicPlayer implements Player{

    public CDPlayer(Song[] songsLibrary) {
        super(songsLibrary);
    }

    @Override
    public void musicPlay() {
        System.out.println("CD play" + getCurrentSong());

    }

    @Override
    public void musicPause() {
        System.out.println("CD pause music");
    }

    @Override
    public void musicStop() {
        System.out.println("CD stop music");
    }


}
