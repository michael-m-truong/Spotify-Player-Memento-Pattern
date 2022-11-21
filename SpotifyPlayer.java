import java.util.Stack;

public class SpotifyPlayer implements Caretaker{

    Stack<Memento> songHistory = new Stack<>();
    
    /** Saves to played history */
    //@Override
    public void addMemento(Memento memento) {
        songHistory.push(memento);
    }

    //@Override
    public Memento getMemento() {
        return songHistory.pop();
    }
    
}
