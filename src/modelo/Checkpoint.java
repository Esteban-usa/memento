package modelo;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Checkpoint {
    
    private BufferedImage texture;
    private int x, y, width,height;
    private boolean usado;
    
    public Checkpoint(BufferedImage texture, int x, int y,int width,int height, boolean usado) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.usado = usado;
    }

    public void draw(Graphics g) {
        g.drawImage(this.texture, this.x, this.y, this.width, this.height, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    
    
}
