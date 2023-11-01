package modelo;

import java.awt.Graphics;

public class GameState {

    private Player player;
    private Checkpoint checkpoint;

    public GameState(){
        player = new Player(Buffered.imageLoader("D:\\Programacion\\universidad\\semestre 6\\patrones\\Memento\\src\\img\\cubo.png"),20,450,5);
        checkpoint = new Checkpoint(Buffered.imageLoader("D:\\Programacion\\universidad\\semestre 6\\patrones\\Memento\\src\\img\\checkpoint.png"),20,20,false);
    }  
    
    public void update(){
        player.update();
    }

    public void draw(Graphics g){
        checkpoint.draw(g);
        player.draw(g);
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Checkpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(Checkpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

    

    
}
