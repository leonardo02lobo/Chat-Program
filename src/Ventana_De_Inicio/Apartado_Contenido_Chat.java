package Ventana_De_Inicio;

import java.awt.*;
import javax.swing.*;

public class Apartado_Contenido_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    //metodo constructor que se encarga de almacenar los chats guardados del usuario
    public Apartado_Contenido_Chat() {
        super.setLayout(null);
        super.setSize(370, too.height - 200);
        super.setLocation(0, 150);
        super.setBackground(Color.red);
    }
}
