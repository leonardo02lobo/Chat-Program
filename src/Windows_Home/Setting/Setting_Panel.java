package Windows_Home.Setting;

import Windows_Home.Diagonal_Panel;
import Windows_Home.Window_Home;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Setting_Panel extends JPanel{
    Dimension too = super.getToolkit().getScreenSize();
    public Setting_Panel(){
        super.setLayout(null);
        super.setSize(too);
        super.setBackground(Color.red);
        super.setLocation(0,0);
        init();
    }
    
    private void init(){
        JButton a = new JButton("<---");
        a.setBounds(20,20,100,40);
        super.add(a);
        a.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window_Home.timer.start();
                Window_Home.Position = 5;
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    JPanel panel = new JPanel();
    Diagonal_Panel diagonal = new Diagonal_Panel();
}
