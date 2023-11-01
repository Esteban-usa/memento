package modelo;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import controlador.KeyBoard;

public class Player implements Cloneable {

    private BufferedImage texture;
    private int x, y,width,height;
    private double vel;
    //private Rectangle rectangle;

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    int saveFiles = 0, currentPlayers = 0;

    public Player(BufferedImage texture, int x, int y,int width,int height, double vel) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.vel = vel;
    }

    public void draw(Graphics g) {
        g.drawImage(texture, this.x, this.y, this.width, this.height, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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
        

        if (KeyBoard.UNDU) { // tecla f
            Memento memento = caretaker.getMemento();
            if (memento != null) {
                currentPlayers--;
                this.x = originator.restoreMemento(memento).x;
                this.y = originator.restoreMemento(memento).y;
            } else {
                System.out.println("No hay que deshacer");
            }
        }

        if (KeyBoard.REDU) { // tecla h
            Memento memento = caretaker.getMemento2();
            if (memento != null) {
                currentPlayers++;
                this.x = originator.restoreMemento(memento).x;
                this.y = originator.restoreMemento(memento).y;
            } else {
                System.out.println("No hay que rehacer");
            }
        }
    }

    public void Memento(){
       
            Player clonedPlayer = this.clone();
            originator.set(clonedPlayer);
            caretaker.addMemento(originator.storeMemento());
            saveFiles++;
            currentPlayers++;
        
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