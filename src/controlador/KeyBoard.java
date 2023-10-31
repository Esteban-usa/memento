package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {
    
    private boolean[] keys = new boolean[256];

    public static boolean UP, DOWN, LEFT, RIGHT,SAVE,UNDU,REDU;

    public KeyBoard(){
        UP = false;
        DOWN = false;
        LEFT = false;
        RIGHT = false;
        SAVE = false;
    }

    public void update(){
        UP = keys[KeyEvent.VK_UP];
        DOWN = keys[KeyEvent.VK_DOWN];
        LEFT = keys[KeyEvent.VK_LEFT];
        RIGHT = keys[KeyEvent.VK_RIGHT];
        SAVE = keys[83]; // TECLA S
        UNDU = keys[70]; // TECLA F
        REDU = keys[72]; // TECLA H

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        //System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
