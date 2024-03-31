package Windows_Home.Setting;

import Utils.metodos_Configuracion;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_User extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();
    JPanel Panel_Interfaz = new JPanel();

    

    public Panel_User() {
        super.setLayout(null);
        super.setBackground(Color.GREEN);
        super.setSize(too.width - 273, too.height);
        super.setLocation(0, 0);
        Panel_Interfaz.setLayout(null);
        Panel_Interfaz.setBackground(Color.GRAY);
        Panel_Interfaz.setSize(getWidth()/2, getHeight()/2);
        Panel_Interfaz.setLocation(100, 100);
        super.add(Panel_Interfaz);
        User();
    }

    private void User() {

        metodos_Configuracion.iniciarComponentes(this, Perfil, 20, 50, 200, 30, "Mi Cuenta");
        metodos_Configuracion.iniciarComponentes(this, Tag, 20, 70, 200, 30, "Username");
    }

    JLabel Perfil = new JLabel();
    JLabel Tag = new JLabel();
}
