package modelo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import controlador.KeyBoard;

public class Player {

    private BufferedImage texture;
    private int x, y;
    private double vel;

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    int saveFiles = 0, currentPlayers = 0;

    public Player(BufferedImage texture, int x, int y, double vel) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.vel = vel;
    }

    public void draw(Graphics g) {
        g.drawImage(texture, this.x, this.y, 100, 100, null);
    }

    public void update() {
        if (KeyBoard.RIGHT) {
            this.x += this.vel;
        }
        if (KeyBoard.LEFT) {
            this.x -= this.vel;
        }
        if (KeyBoard.UP) {
            this.y -= this.vel;
        }
        if (KeyBoard.DOWN) {
            this.y += this.vel;
        }
        if (KeyBoard.SAVE) { // tecla s
            originator.set(this);
            caretaker.addMemento(originator.storeMemento());
            saveFiles++;
            currentPlayers++;
        }
        if (KeyBoard.UNDU) { // tecla f
            currentPlayers--;
            // Player = originator.restoreMemento(caretaker.getMemento(currentPlayers));
        }
        if (KeyBoard.REDU) { // tecla h
            if ((saveFiles - 1) > currentPlayers) {
                currentPlayers++;
                // Player = originator.restoreMemento(caretaker.getMemento(currentPlayers));
            }
        }
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getVel() {
        return vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

}