package Windows_Home;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Chat() {
        super.setLayout(null);
        super.setBackground(Color.blue);
        super.setLocation(100, 100);
        super.setSize(too.width - 110, too.height - 140);
    }
}
