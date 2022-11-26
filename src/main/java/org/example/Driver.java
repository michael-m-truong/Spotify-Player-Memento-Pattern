package org.example;

import javax.sound.midi.Track;

import org.example.models.Song;
import org.example.models.TrackMetadata;

public class Driver {
    private static final SpotifySession spotifySession = new SpotifySession();
    private static final SpotifyApp spotifyApp = new SpotifyApp();

    private static void play(Song song) {
        spotifySession.playSong(song);
        spotifyApp.addMemento(spotifySession.createMemento());
        System.out.println("Playing song: " + spotifySession.getCurrentSong());
    }

    private static void previous() {
        spotifySession.setMemento(spotifyApp.getMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong());
    }

    public static void main(String[] args) {
        TrackMetadata metaSong0 = new TrackMetadata("The Weekend", "In Your Eyes", 238, "Soul, Pop", 0);
        TrackMetadata metaSong1 = new TrackMetadata("Niki", "Lose", 257, "Indie Folk", 1);
        TrackMetadata metaSong2 = new TrackMetadata("Post Malone", "Reputation", 249, "Soul, Pop", 1);

        Song song0 = new Song(metaSong0);
        Song song1 = new Song(metaSong1);
        Song song2 = new Song(metaSong2);

        // Queue.
        play(song0);
        play(song1);
        play(song2);

        // Undo!
        previous();
        previous();
        previous();
    }
}
