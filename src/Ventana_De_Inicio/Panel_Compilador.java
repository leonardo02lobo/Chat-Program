package Ventana_De_Inicio;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Compilador extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Compilador() {
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        super.setLocation(130, 100);
        super.setSize(too.width - 145, too.height - 140);
    }
}
