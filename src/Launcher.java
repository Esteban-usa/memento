import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Launcher {
    public static void main(String[] args) throws Exception {
        

       Modelo m = new Modelo();

        Controlador c = new Controlador(m);

        Vista v = new Vista(c);
        
    }
}
