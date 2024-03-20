package Windows_Home;

import Utils.Var_necessary;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Diagonal_Panel extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Diagonal_Panel() {
        super.setLayout(null);
        super.setBackground(Color.gray);
        super.setLocation(0, 0);
        super.setSize(365, too.height);
        init();
    }

    private void init() {
        initLabel((getWidth() / 2) - 150, getHeight() - 700, 50, 30, label_chat, "Chat");
        initLabel(getWidth() / 2, getHeight() - 700, 150, 30, label_Community, "Community");
        initLabel(getWidth() - 100, getHeight() - 750, 100, 50, setting, "...");
    }

    private void initLabel(int x, int y, int width, int height, JLabel label, String text) {
        label.setText(text);
        label.setBounds(x, y, width, height);
        label.setForeground(Color.white);
        label.setFont(new Font(Var_necessary.type, 1, 20));
        super.add(label);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window_Home.timer.start();
                if (e.getSource().equals(label_chat)) {
                    Window_Home.Position = 0;
                } else if (e.getSource().equals(label_Community)) {
                    Window_Home.Position = 1;
                } else if (e.getSource().equals(setting)) {
                    Window_Home.Position = 4;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(Color.white);
            }
        });
    }

    JLabel label_chat = new JLabel();
    JLabel label_Community = new JLabel();
    JLabel setting = new JLabel();
}
