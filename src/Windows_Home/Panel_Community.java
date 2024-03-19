package Windows_Home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Community extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Community() {
        super.setLayout(null);
        super.setBackground(Color.GRAY/*new Color(10, 15, 20)*/);
        super.setLocation(0, 0);
        super.setSize(too.width - 380, too.height);
    }
}
