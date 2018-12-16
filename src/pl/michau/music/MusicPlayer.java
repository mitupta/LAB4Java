package pl.michau.music;

public abstract class MusicPlayer implements Player {

private Song[] songsLibrary;
private int currentSong;
private int status; // 0 - play, 1 - pause , 2 - stop

    public MusicPlayer(Song[] songsLibrary) {
        this.currentSong = 0;
        this.songsLibrary = songsLibrary;
    }

    public Song getCurrentSong(){
        return songsLibrary[currentSong];
    }

    @Override
    public void nextSong() {
        if (++currentSong >= songsLibrary.length){
            currentSong = 0;
        }
        else {
            currentSong++;
            musicPlay();
        }

    }

    @Override
    public void previousSong() {
        if (--currentSong <= 0){
            currentSong = songsLibrary.length - 1;
        }
        else {
            currentSong--;
            musicPlay();
        }
    }
}
