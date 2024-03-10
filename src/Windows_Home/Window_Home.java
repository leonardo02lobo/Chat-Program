package Windows_Home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Window_Home extends JPanel {

    public Window_Home() {
        super.setSize(too);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(diagonal);
                add(Bar);
                CurrentPanel();
            }
        });
        tiempo.start();
    }

    private void CurrentPanel() {
        switch (Posicion) {
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

    private void Change_Panels(JPanel panel) {
        super.removeAll();
        super.add(panel, BorderLayout.CENTER);
        super.add(diagonal);
        super.add(Bar);
        super.revalidate();
        super.repaint();
    }

    public static int Posicion;
    Dimension too = super.getToolkit().getScreenSize();
    Diagonal_Panel diagonal = new Diagonal_Panel();
    Panel_Chat chat = new Panel_Chat();
    Panel_Community community = new Panel_Community();
    Navigation_Bar Bar = new Navigation_Bar();
    Panel_AI ia = new Panel_AI();
    Panel_Compiler compiler = new Panel_Compiler();
}
