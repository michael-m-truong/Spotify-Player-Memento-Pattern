package org.example;

import org.example.models.Song;

public class Driver {
    
    public static void main(String[] args) {

        Song song0 = new Song("In your eyes", "The Weekend");
        Song song1 = new Song("I feel it coming", "The Weekend");
        Song song2 = new Song("Less than zero", "The Weekend");

        Song song3 = new Song("Before", "Niki");
        Song song4 = new Song("Lose", "Niki");
        Song song5 = new Song("Plot Twist", "Niki");

        Song song6 = new Song("Goodbyes", "Post Malone");
        Song song7 = new Song("Thousand bad times", "Post Malone");
        Song song8 = new Song("Reputation", "Post Malone");

        /*
        Playlist playlist0 = new Playlist();
        Playlist playlist1 = new Playlist();
        Playlist playlist2 = new Playlist();

        playlist0.addSong(song0);
        playlist0.addSong(song1);
        playlist0.addSong(song2); */

        SpotifySession spotifySession = new SpotifySession();  // originator
        SpotifyApp spotifyApp = new SpotifyApp();  // caretaker

        spotifySession.play(song0);
        spotifyApp.addMemento(spotifySession.createMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());

        spotifySession.play(song4);
        spotifyApp.addMemento(spotifySession.createMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());

        spotifySession.play(song8);
        spotifyApp.addMemento(spotifySession.createMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());

        /** Going back to previous song intially plays twice b/c song replayed before going back (we can change this if wanted) */
        spotifySession.setMemento(spotifyApp.getMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());

        spotifySession.setMemento(spotifyApp.getMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());

        spotifySession.setMemento(spotifyApp.getMemento());
        System.out.println("Current song: " + spotifySession.getCurrentSong() + " -- by " + spotifySession.getCurrentArtist());
    }
}
