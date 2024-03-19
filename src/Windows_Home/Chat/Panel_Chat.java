package Windows_Home.Chat;

import Utils.Var_necessary;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Chat() {
        super.setLayout(null);
        super.setBackground(Var_necessary.color);
        super.setLocation(0, 0);
        super.setSize(too.width - 380, too.height);
        JTextField a = new JTextField();
        a.setBounds(20,20,100,20);
        add(a);
    }

}


