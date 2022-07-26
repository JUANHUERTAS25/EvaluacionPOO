package Vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel{

    public JButton btArea;

    public PanelOperaciones()
    {
        this.setLayout(null);
        //this.setBackground(Color.WHITE);

        btArea = new JButton("Hallar");
        btArea.setBounds(10,20,120,30);
        this.add(btArea);
        btArea.setActionCommand("hallar");


        
    }

    
}
