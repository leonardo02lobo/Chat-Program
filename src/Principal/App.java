package Principal;

import Ventana_Login.Ventana_Login;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static int ancho = 1000;
    public static int alto = 700;
    public static JFrame Ventana2 = new JFrame();
    public static JFrame Ventana = new JFrame();
    public Image icono = new ImageIcon(getClass().getResource("../source/icon-app.png")).getImage();

    public static void main(String[] args) {
        Ventana_Login window = new Ventana_Login();
        App app = new App();
        Ventana.add(window);
        Ventana.pack();
        Ventana.setTitle("Chat Para Programadores");
        Ventana.setIconImage(app.icono);
        Ventana.setSize(App.ancho,App.alto);
        Ventana.setResizable(false);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }
}
