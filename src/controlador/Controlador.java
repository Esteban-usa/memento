package controlador;

import modelo.GameState;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
    
    private Modelo m;
    private Vista v;

    public KeyBoard keyboard;
    public GameState gameState;

    public Controlador(Modelo m){
        this.m = m;
        
        init();
    }

    public void init() {
        keyboard = new KeyBoard();
        gameState = new GameState();
    }

    public Vista getV() {
        return v;
    }

    public void setV(Vista v) {
        this.v = v;
    }

    
}
