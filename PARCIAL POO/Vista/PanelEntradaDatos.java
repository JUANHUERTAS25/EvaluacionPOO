package Vista;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEntradaDatos extends JPanel{
    private JLabel lx;
    private JComboBox cbFiguras;
    private String[] figuras = {"Cubo", "Cilindro", "Cono", "Esfera"};

    public PanelEntradaDatos()
    {
        lx = new JLabel("Seleccione la figura");
        lx.setBounds(300, 20, 150, 20);
        this.add(lx);

        cbFiguras = new JComboBox();
        for(int i=0; i<figuras.length;i++)
        {
            cbFiguras.addItem(figuras[i]);
        }
        cbFiguras.setBounds(300,50,110,20);
        this.add(cbFiguras);
    }

    public String getFigura()
    {
        return (String) cbFiguras.getSelectedItem();
    }
    
}
