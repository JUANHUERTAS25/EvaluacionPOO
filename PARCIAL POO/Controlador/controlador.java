package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Vista.VentanaPrincipal;
import modelo.*;

public class controlador implements ActionListener
{
    private VentanaPrincipal vista;
    private FiguraGeometrica modelo;
    private Cilindro modelo2;
    private Cono modelo3;
    private Cubo modelo4;
    private Esfera modelo5;

    public controlador(VentanaPrincipal v, FiguraGeometrica m)
    {
        vista = v;
        modelo = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("hallar"))
        {
            modelo.setNombre(vista.miPanelEntradaDatos.getFigura());
            vista.miPanelResultados.mostrarResultado("La figura que selecciono es: " + modelo.getNombre());
                
        }
        
    }
        
}
