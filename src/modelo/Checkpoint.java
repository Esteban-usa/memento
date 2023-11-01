package modelo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Checkpoint {
    
    private BufferedImage texture;
    private int x, y;
    private boolean usado;
    
    public Checkpoint(BufferedImage texture, int x, int y, boolean usado) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.usado = usado;
    }

    public void draw(Graphics g) {
        g.drawImage(this.texture, this.x, this.y, 50, 50, null);
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    
    
}
