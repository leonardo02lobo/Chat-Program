package Principal;

import Window.Window_Login;
import javax.swing.JFrame;

public class App {

    public static int width = 1000;
    public static int height = 700;
    public static JFrame windowApp = new JFrame();

    public static void main(String[] args) {
        Window_Login window = new Window_Login();
        windowApp.add(window);
        windowApp.pack();
        windowApp.setTitle("Chat Para Programadores");
        windowApp.setSize(App.width, App.height);
        windowApp.setResizable(true);
        windowApp.setLocationRelativeTo(null);
        windowApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowApp.setVisible(true);
    }
}
