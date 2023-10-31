package modelo;

import java.awt.Graphics;

public class GameState {

    private Player player;

    public void GameState(){
        player = new Player(Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\memento\\src\\img\\cubo.png"),20,20,5,5);
    }  
    
    public void update(){
        player.update();
    }

    public void draw(Graphics g){
        player.draw(g);
    }

    
}
