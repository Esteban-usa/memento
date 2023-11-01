package modelo;

public class Originator {
    
    private Player player;

    public void set(Player newplayer) {
        System.out.println("desde originator se hizo un set");

        this.player = newplayer;
    }

    public Memento storeMemento(){
        System.out.println("desde originator se guardo memento");
        return new Memento(this.player);
    }

    public Player restoreMemento(Memento memento){
        player = memento.getSavedPlayer();

        System.out.println("desde originator se guardo en memento");
        return player;
    }
}
