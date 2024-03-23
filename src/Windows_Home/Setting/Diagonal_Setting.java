package Windows_Home.Setting;

import Utils.Var_necessary;
import Windows_Home.Window_Home;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Diagonal_Setting extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Diagonal_Setting() {
        super.setLayout(null);
        super.setBackground(Var_necessary.color);
        super.setSize(too.width / 5, too.height);
        super.setLocation(0, 0);
        init();
    }

    private void init() {
        initLabel(this, exit_diagonal, 20, 20, 100, 40, "Atras");
        initLabel(this, Diagonal_setting_panel, 20, 100, 100, 40, "Setting");
        initLabel(this, Diagonal_User_panel, 20, 150, 100, 40, "User");
        initLabel(this, Diagonal_help_panel, 20, 200, 100, 40, "Help");
    }

    private void initLabel(JPanel panel, JLabel label, int x, int y, int width, int height, String text) {
        label.setFont(new Font(Var_necessary.type, 1, 20));
        label.setText(text);
        label.setForeground(Color.white);
        label.setBounds(x, y, width, height);
        panel.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource().equals(exit_diagonal)) {
                    Window_Home.timer.start();
                    Window_Home.Position = 5;
                }else if (e.getSource().equals(Diagonal_setting_panel)) {
                    Setting_Panel.timer.start();
                    Setting_Panel.index = 0;
                }else if (e.getSource().equals(Diagonal_User_panel)) {
                    Setting_Panel.timer.start();
                    Setting_Panel.index = 1;
                }else if (e.getSource().equals(Diagonal_help_panel)) {
                    Setting_Panel.timer.start();
                    Setting_Panel.index = 2;
                }
            }
        });
    }
    JLabel Diagonal_setting_panel = new JLabel();
    JLabel Diagonal_User_panel = new JLabel();
    JLabel Diagonal_help_panel = new JLabel();
    JLabel exit_diagonal = new JLabel();
}
