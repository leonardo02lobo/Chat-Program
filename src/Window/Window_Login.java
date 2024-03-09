package Window;

import Principal.App;
import Utils.Var_necessary;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window_Login extends JPanel {

    public Window_Login() {
        super.setSize(App.width, App.height);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        init();
    }

    private void init() {
        iniciarPaneles(panel_sign_In);
        initLabel(sign_in, (getWidth() / 2) - 150, getHeight() - 600, 100, 30, "SIGN IN");
        initLabel(linea, (getWidth() / 2) - 140, getHeight() - 585, 100, 30, "_____");
        initLabel(sign_up, (getWidth() / 2) + 50, getHeight() - 600, 100, 30, "SIGN UP");
    }

    private void initLabel(JLabel label, int x, int y, int width, int height, String text) {
        label.setText(text);
        label.setFont(new Font(Var_necessary.type, 1, 20));
        label.setForeground(Color.cyan);
        label.setBounds(x, y, width, height);
        super.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (label.getText() == "SIGN IN") {
                    initLabel(linea, (getWidth() / 2) - 130, getHeight() - 550, 100, 30, "_____");
                    iniciarPaneles(panel_sign_In);
                } else {
                    initLabel(linea, (getWidth() / 2) + 70, getHeight() - 550, 100, 30, "_____");
                    iniciarPaneles(panel_sign_Up);
                }
            }
        });
    }
    
    private void iniciarPaneles(JPanel panel){
        removeAll();
        add(panel,BorderLayout.CENTER);
        revalidate();
        repaint();
        add(sign_in);
        add(sign_up);
        add(linea);
    }

    Panel_Sign_in panel_sign_In = new Panel_Sign_in();
    Panel_Sign_Up panel_sign_Up = new Panel_Sign_Up();
    JLabel sign_in = new JLabel();
    JLabel sign_up = new JLabel();
    JLabel linea = new JLabel();
}
