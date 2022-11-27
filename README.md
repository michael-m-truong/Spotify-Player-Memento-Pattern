# Spotify-Player-Memento-Pattern

## Overview
This project is an example of how the Memento design pattern can be used. The Memento design pattern lets you save and restore the previous state of an object without revealing the details of its implementation. In other words, the design pattern ensures that it does not break encapsulation. 

There are 3 classes that must be added in order to implement the Memento pattern.
1) Originator: contains state of an object to be restored
2) Memento: creates and stores states in Memento objects
3) Caretaker: holds saved Mementos and is responsible for restoring object state 

This pattern can be demonstrated through a playing music on a Spotify Player. When you play a song and want to go back to the previous song played, the Memento pattern is used. The song is the state being saved and restored. For our project: 
1) SpotifySession class implements the Originator interface
2) Song class implements the Memento interface 
3) SpotifyApp implements the Caretaker class. 

When a user plays a song, a Song memento is created from the SpotifySession and saved to the SpotifyApp. All the mementos are saved in a Stack. If a user wants to go back to the previous song played, the SpotifyApp pops the memento on top of the stack and restores that state to the SpotifySession. 
