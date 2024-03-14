package Windows_Home;

import Utils.TextPrompt;
import Utils.Var_necessary;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Chat() {
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        super.setLocation(130, 100);
        super.setSize(too.width - 145, too.height - 140);
        init();
    }

    private void init() {
        panelscroll.setLayout(null);
        panelscroll.setBackground(Color.red);
        panelscroll.setLocation(0, 0);
        panelscroll.setPreferredSize(new Dimension(400, 400));
        panelscroll.setSize(getWidth(), (getHeight() / 2) + 230);
        this.add(panelscroll);

        TextPrompt texto = new TextPrompt("Message", Message);
        Message.setBounds(20, (getHeight() / 2) + 250, getWidth() - 150, 50);
        Message.setFont(new Font(Var_necessary.type, 1, 20));
        add(Message);
    }
    JPanel panelscroll = new JPanel();
    JTextField Message = new JTextField();
}
