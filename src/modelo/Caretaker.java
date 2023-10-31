package modelo;

import java.util.ArrayList;

public class Caretaker {
    
    ArrayList<Memento> savedPlayers = new ArrayList<Memento>();

    public void addMemento(Memento m){
        savedPlayers.add(m);
    }

    public Memento getMemento(int index){
        return savedPlayers.get(index);
    }
}
