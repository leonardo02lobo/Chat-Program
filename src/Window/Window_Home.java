package Window;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Window_Home extends JPanel{
    
    public Window_Home() {
        Dimension too = super.getToolkit().getScreenSize();
        super.setSize(too);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
    }
}
