package Window;

import Windows_Home.Window_Home;
import Principal.App;
import Utils.methods_File;
import Utils.necessary_methods;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Sign_in extends JPanel {

    public Panel_Sign_in() {
        super.setLayout(null);
        super.setSize(400, 500);
        super.setBackground(new Color(10, 15, 20));
        super.setLocation(290, 160);
        init();
    }

    private void init() {
        methods.initLabel(this, label_username, (getWidth() / 2) - 150, getHeight() - 430, 150, 30, "USERNAME");
        methods.initTextField(this, username, (getWidth() / 2) - 150, getHeight() - 400, 300, 30);
        methods.initLabel(this, label_password, (getWidth() / 2) - 150, getHeight() - 330, 150, 30, "PASSWORD");
        methods.initTextField(this, password, (getWidth() / 2) - 150, getHeight() - 300, 300, 30);
        methods.initCheck(this, lic_sign_in, (getWidth() / 2) - 150, getHeight() - 200, 150, 30, "KEEP ME SIGN IN");
        initButton(button_sign_in, (getWidth() / 2) - 80, getHeight() - 150, 150, 30, "SIGN IN");
    }

    private void initButton(JButton button, int x, int y, int width, int height, String text) {
        button.setBounds(x, y, width, height);
        button.setText(text);
        button.setBackground(Color.cyan);
        button.setForeground(Color.white);
        button.setOpaque(false);
        super.add(button);
        panel = this;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String user = username.getText();
                    String pass = password.getText();
                    methods_File file = new methods_File();
                    file.setDatos(user, pass);
                    file.Read_File();
                    if ((lic_sign_in.isSelected()) && band) {
                        OpenWindow();
                    } else {
                        methods.initLabel(panel, warning, getWidth()-350, getHeight()-100, 350, 30, "Algo salio mal, Intenta nuevamente");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Panel_Sign_in.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void OpenWindow() {
        Window_Home window = new Window_Home();
        JFrame windowApp = new JFrame();
        App app = new App();
        windowApp.add(window);
        windowApp.pack();
        windowApp.setIconImage(app.icon);
        windowApp.setTitle("Chat Para Programadores");
        windowApp.setSize(too);
        windowApp.setResizable(true);
        windowApp.setLocationRelativeTo(null);
        windowApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowApp.setVisible(true);
        App.windowApp.dispose();
    }

    public static boolean band = false;
    Dimension too = super.getToolkit().getScreenSize();
    necessary_methods methods = new necessary_methods();
    JLabel sign_in = new JLabel();
    JLabel sign_up = new JLabel();
    JLabel label_username = new JLabel();
    JTextField username = new JTextField();
    JLabel label_password = new JLabel();
    JTextField password = new JTextField();
    JCheckBox lic_sign_in = new JCheckBox();
    JButton button_sign_in = new JButton();
    JLabel linea = new JLabel();
    JLabel warning = new JLabel();
    JPanel panel = new JPanel();
}
