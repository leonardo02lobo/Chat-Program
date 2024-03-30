package Windows_Home.Setting;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel_User extends JPanel{
    Dimension too = super.getToolkit().getScreenSize();

    public Panel_User() {
        super.setLayout(null);
        super.setBackground(Color.GREEN);
        super.setSize(too.width-273, too.height);
        super.setLocation(0, 0);
    }
}
