package Ventana_De_Inicio;

import java.awt.*;
import javax.swing.*;

public class Apartado_Contenido_Chat extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();
    
    public Apartado_Contenido_Chat() {
        super.setLayout(null);
        super.setBackground(Color.red);
        super.setSize(365,too.height-200);
        super.setLocation(0,150);
    }

}