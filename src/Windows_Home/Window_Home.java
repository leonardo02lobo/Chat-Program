package Windows_Home;

import Utils.Var_necessary;
import Windows_Home.Chat.Panel_Chat;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Window_Home extends JPanel {

    public Window_Home() {
        super.setSize(too);
        super.setLayout(null);
        super.setBackground(Var_necessary.color);
        super.add(diagonal);
        panel.setLayout(null);
        panel.setBackground(Var_necessary.color);
        panel.setLocation(365, 0);
        panel.setSize(too.width - 380, too.height);
        super.add(panel);
        timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CurrentPanel();
            }
        });
        timer.start();
    }

    private void CurrentPanel() {
        switch (Position) {
            case 0:
                Change_Panels(chat);
                break;
            case 1:
                Change_Panels(community);
                break;
            case 2:
                Change_Panels(ia);
                break;
            case 3:
                Change_Panels(compiler);
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
    public static Timer timer;
    public static byte Position;
    JPanel panel = new JPanel();
    Dimension too = super.getToolkit().getScreenSize();
    Panel_Chat chat = new Panel_Chat();
    Panel_Community community = new Panel_Community();
    Panel_AI ia = new Panel_AI();
    Panel_Compiler compiler = new Panel_Compiler();
    Diagonal_Panel diagonal = new Diagonal_Panel();
}
