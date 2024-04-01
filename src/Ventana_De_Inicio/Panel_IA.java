package Ventana_De_Inicio;

import java.awt.*;
import javax.swing.*;
import utilidades_del_programa.*;

public class Panel_IA extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_IA() {
        super.setLayout(null);
        super.setBackground(Variables_Globales.Color);
        super.setLocation(130, 100);
        super.setSize(too.width - 145, too.height - 140);
    }
}
