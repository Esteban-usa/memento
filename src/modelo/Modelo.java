package modelo;

import java.awt.image.BufferedImage;

public class Modelo {

    private BufferedImage texture;
    private float x, y;
    private float velX, velY;

    public Modelo(BufferedImage texture, float x, float y, float velX, float velY) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
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
