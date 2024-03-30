package Window;

import Utils.methods_File;
import Utils.necessary_methods_Login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Panel_Sign_Up extends JPanel {

    public Panel_Sign_Up() {
        super.setLayout(null);
        super.setSize(400, 500);
        super.setBackground(new Color(10, 15, 20));
        super.setLocation(290, 160);
        init();
    }

    private void init() {
        necessary_methods_Login.initLabel(this, label_name, (getWidth() / 2) - 150, (getHeight() / 2) - 230, 150, 30, "NAME");
        necessary_methods_Login.initTextField(this, name, (getWidth() / 2) - 150, (getHeight() / 2) - 200, 300, 30);
        necessary_methods_Login.initLabel(this, label_user, (getWidth() / 2) - 150, (getHeight() / 2) - 130, 150, 30, "USERNAME");
        necessary_methods_Login.initTextField(this, user, (getWidth() / 2) - 150, (getHeight() / 2) - 100, 300, 30);
        necessary_methods_Login.initLabel(this, label_password, (getWidth() / 2) - 150, (getHeight() / 2) - 30, 150, 30, "PASSWORD");
        necessary_methods_Login.initTextField(this, password, (getWidth() / 2) - 150, (getHeight() / 2), 300, 30);
        necessary_methods_Login.initLabel(panel, warning, getWidth() - 350, getHeight() - 50, 400, 30, "");
        initButton(button, (getWidth() / 2) - 80, getHeight() - 150, 150, 30, "REGISTER");
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
                if (name.getText().equals("") && user.getText().equals("") && password.getText().equals("")) {
                    necessary_methods_Login.initLabel(panel, warning, getWidth() - 350, getHeight() - 50, 400, 30, "Algo salio mal, Intenta nuevamente");
                } else {
                    file.write_File(user.getText(), password.getText(), name.getText());
                    necessary_methods_Login.initLabel(panel, warning, getWidth() - 350, getHeight() - 50, 400, 30, "Datos Agregados,Volver al Sign in");
                }
            }
        });
    }
    methods_File file = new methods_File();
    JLabel label_name = new JLabel();
    JTextField name = new JTextField();
    JLabel label_user = new JLabel();
    JTextField user = new JTextField();
    JLabel label_password = new JLabel();
    JPasswordField password = new JPasswordField();
    JButton button = new JButton();
    JLabel warning = new JLabel();
    JPanel panel = new JPanel();
}
