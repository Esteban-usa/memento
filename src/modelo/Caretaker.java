package modelo;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> savedPlayers = new Stack<>();
    private Stack<Memento> savedPlayers2 = new Stack<>();

    public void addMemento(Memento m) {
        savedPlayers.push(m); // Push (agregar) el memento a la pila
    }

    public Memento getMemento() {
        if (!savedPlayers.isEmpty()) {
            return savedPlayers2.push(savedPlayers.pop());
        } else {
            return null;
        }
    }

    public Memento getMemento2() {
        if (!savedPlayers2.isEmpty()) {
            return savedPlayers2.pop();
        } else {
            return null;
        }
    }
}
