package Windows_Home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Community extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Community() {
        super.setLayout(null);
        super.setBackground(Color.red);
        super.setLocation(130, 100);
        super.setSize(too.width - 145, too.height - 140);
    }
}
