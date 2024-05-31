package Principal;

import Ventana_De_Inicio.Ventana_Inicio;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {

    //variables que se encarga del sistema
    public static int ancho = 1000;
    public static int alto = 700;
    public Image icono = new ImageIcon(getClass().getResource("../source/icon-app.png")).getImage();

    public static void main(String[] args) {
        //crear e instanciar el JFrame
        JFrame Ventana = new JFrame();
        Ventana_Inicio window = new Ventana_Inicio();
        Dimension too = window.getToolkit().getScreenSize();
        App app = new App();
        Ventana.add(window);
        Ventana.setIconImage(app.icono);
        Ventana.setTitle("Chat Para Programadores");
        Ventana.setSize(too);
        Ventana.setResizable(false);
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }
}
//        Ventana_Login window = new Ventana_Login();
//        App app = new App();
//        Ventana.add(window);
//        Ventana.pack();
//        Ventana.setTitle("Chat Para Programadores");
//        Ventana.setIconImage(app.icono);
//        Ventana.setSize(App.ancho,App.alto);
//        Ventana.setResizable(false);
//        Ventana.setLocationRelativeTo(null);
//        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Ventana.setVisible(true);