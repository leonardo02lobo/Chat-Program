package Windows_Home.Setting;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Setting_Panel extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Setting_Panel() {
        super.setLayout(null);
        super.setSize(too);
        super.setLocation(0, 0);
        timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Current();
            }
        });
        timer.start();
        panel.setLayout(null);
        panel.setSize(too.width-273, too.height);
        panel.setLocation(273, 0);
        super.add(panel);
        super.add(diagonal_setting);
    }

    private void Current() {
        switch (index) {
            case 0:
                Change_Panels(panel_setting);
                break;
                case 1:
                Change_Panels(panel_User);
                break;
                case 2:
                Change_Panels(panel_Help);
                break;
        }
    }

    private void Change_Panels(JPanel content) {
        panel.removeAll();
        panel.add(content, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
        timer.stop();
    }

    public static byte index = 0;
    JPanel panel = new JPanel();
    public static Timer timer;
    Diagonal_Setting diagonal_setting = new Diagonal_Setting();
    Panel_setting panel_setting = new Panel_setting();
    Panel_User panel_User = new Panel_User();
    Panel_Help panel_Help = new Panel_Help();
}
