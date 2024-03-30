package Principal;

import Window.Window_Login;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static int width = 1000;
    public static int height = 700;
    public static JFrame windowApp2 = new JFrame();
    public static JFrame windowApp = new JFrame();
    public Image icon = new ImageIcon(getClass().getResource("../Multimedia/icon-app.png")).getImage();

    public static void main(String[] args) {
        Window_Login window = new Window_Login();
        App app = new App();
        windowApp.add(window);
        windowApp.pack();
        windowApp.setTitle("Chat Para Programadores");
        windowApp.setIconImage(app.icon);
        windowApp.setSize(App.width, App.height);
        windowApp.setResizable(false);
        windowApp.setLocationRelativeTo(null);
        windowApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowApp.setVisible(true);
    }
}
