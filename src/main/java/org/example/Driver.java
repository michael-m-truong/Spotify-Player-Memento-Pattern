package org.example;

import org.example.models.Song;

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
        Song song0 = new Song("In your eyes - The Weekend");
        Song song1 = new Song("Lose - Niki");
        Song song2 = new Song("Reputation - Post Malone");

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
