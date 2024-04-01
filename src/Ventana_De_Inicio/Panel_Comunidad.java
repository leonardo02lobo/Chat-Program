package Ventana_De_Inicio;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Comunidad extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Comunidad() {
        super.setLayout(null);
        super.setBackground(Color.GRAY);
        super.setLocation(0, 0);
        super.setSize(too.width - 380, too.height);
    }
}
