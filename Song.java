public class Song implements Memento {

    private final String songName;
    private final String artistName;
    //private String fromPlaylist;

    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    /** Memento should have a getter but NOT a setter */
    @Override
    public String getState() {
        return songName;
    }


    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }
    
}
