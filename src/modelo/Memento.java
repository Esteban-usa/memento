package modelo;

public class Memento {
    
    private Player player;

    public Memento(Player playerToSave) {
        player = playerToSave;
    }

    public Player getSavedPlayer(){
        return player;
    }
}
