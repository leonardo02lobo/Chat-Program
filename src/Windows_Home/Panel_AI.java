package Windows_Home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_AI extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_AI() {
        super.setLayout(null);
        super.setBackground(Color.cyan);
        super.setLocation(130, 100);
        super.setSize(too.width - 145, too.height - 140);
    }
}
