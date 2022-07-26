package Vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
        //---------------
    // Atributos
    // --------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
   
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelResultados()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        //this.setBackground(Color.WHITE);

        //Crear y agregar area de texto 
        taResultado= new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,70,300,200);
        this.add(spResultado);
        

    }
    // metodo de acceso a la informacion
    public void mostrarResultado(String msg)
    {
        taResultado.append(msg + "\n");
    }

    
    
    // borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }  
}
