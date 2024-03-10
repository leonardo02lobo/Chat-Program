package Windows_Home;

import Window.Navigation_Bar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Window_Home extends JPanel {

    public Window_Home() {
        super.setSize(too);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        super.add(diagonal);
        super.add(chat);
        super.add(Bar);
    }

    public void Change_Panels(JPanel panel) {
        super.removeAll();
        super.add(panel, BorderLayout.CENTER);
        add(diagonal);
        super.revalidate();
        super.repaint();
    }
    Dimension too = super.getToolkit().getScreenSize();
    Diagonal_Panel diagonal = new Diagonal_Panel();
    Panel_Chat chat = new Panel_Chat();
    Navigation_Bar Bar = new Navigation_Bar();
}
