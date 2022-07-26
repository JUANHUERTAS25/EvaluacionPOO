package ejecutable;
import modelo.*;
import Vista.*;
import Controlador.controlador;

public class test {
    public static void main(String[] args) {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        FiguraGeometrica miModelo = null;
        Cilindro miCilindro = null;
        Cono miCono = null;
        Cubo miCubo = null;
        Esfera miEsfera = null;
        controlador miControlador = new controlador(miVentana, miModelo);

    }
}
