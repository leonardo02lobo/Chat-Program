package Windows_Home.Setting;

import Utils.*;
import java.awt.*;
import javax.swing.*;

public class Panel_Aparencia extends JPanel{
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Aparencia() {
        super.setLayout(null);
        super.setBackground(Color.BLUE);
        super.setSize(too.width-273, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        metodos_Configuracion.iniciarComponentes(this,configuracion_Principal, getWidth()/2, 20, 200, 30, "Configuracion");
        metodos_Configuracion.iniciarComponentes(this,CambiarColor, 20, 50, 200, 30, "Cambiar Tema");
        metodos_Configuracion.iniciarComponentes(this,configuracion_Principal, 20, 100, 200, 30, "Cambiar Fuente");
    }
    
    
    JLabel configuracion_Principal = new JLabel();
    JLabel CambiarColor = new JLabel();
    JLabel CambiarTexto = new JLabel();
}
