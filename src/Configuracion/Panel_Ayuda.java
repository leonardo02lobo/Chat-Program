package Configuracion;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Ayuda extends JPanel{
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Ayuda() {
        super.setLayout(null);
        super.setBackground(Color.ORANGE);
        super.setSize(too.width-273, too.height);
        super.setLocation(0, 0);
    }
}
