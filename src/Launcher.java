import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Launcher {
    public static void main(String[] args) {
        //Modelo m = new Modelo();

        Controlador c = new Controlador();

        Vista v = new Vista(c);
    }
}
