package modelo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import controlador.KeyBoard;

public class Player {

    private BufferedImage texture;
    private float x, y;
    private float velX, velY;

    public Player(BufferedImage texture, float x, float y, float velX, float velY) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    public void draw(Graphics g) {
        g.drawImage(texture, 50, 50, null);
    }

    public void update() {
        if (KeyBoard.RIGHT) {
            this.x += this.velX;
        }
        if (KeyBoard.LEFT) {
            this.x -= this.velX;
        }
        if (KeyBoard.UP) {
            this.x -= this.velY;
        }
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }
}