package modelo;

import java.awt.Graphics;

public class GameState {

    private Player player;

    public GameState(){
        player = new Player(Buffered.imageLoader("D:\\Programacion\\universidad\\semestre 6\\patrones\\Memento\\src\\img\\cubo.png"),20,450,5);
    }  
    
    public void update(){
        player.update();
    }

    public void draw(Graphics g){
        player.draw(g);
    }

    
}
