package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Memento {

    private List<Song> songList = new ArrayList<>();

    @Override
    public String getState() {
        // TODO Auto-generated method stub
        return null;
    }

    /*@Override
    public void setState(String state) {
        // TODO Auto-generated method stub
        
    } */

    public void addSong(Song song) {
        songList.add(song);
    }
    
}
