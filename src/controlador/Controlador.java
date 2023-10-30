package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
    
    private Modelo m;
    private Vista v;

    public Controlador(Modelo m){
        this.m = m;
    }

    public void prueba(){
        
    }

    public Vista getV() {
        return v;
    }

    public void setV(Vista v) {
        this.v = v;
    }

    
}
