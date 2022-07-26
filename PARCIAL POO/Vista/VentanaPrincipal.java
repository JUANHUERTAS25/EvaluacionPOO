package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,200,50);
        this.add(miPanelEntradaDatos);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,40,200,50);
        this.add(miPanelOperaciones);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,70,300,300);
        this.add(miPanelResultados);

        this.setTitle("APP FIFA");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
