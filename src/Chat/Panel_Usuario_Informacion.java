package Chat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel_Usuario_Informacion extends JPanel {

    public Panel_Usuario_Informacion() {
        super.setLayout(null);
        super.setBackground(Color.red);
        super.setLocation(580, 0);
        super.setSize(anchoPantalla, altoPantalla);
        JButton a = new JButton("<--");
        a.setBounds(20,20,100,20);
        add(a);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel_Chat.cambiarPanelChatCompleto(new Panel_Chat());
                Panel_Chat.bandera = true;
            }
        });
    }
    
    Dimension too = super.getToolkit().getScreenSize();
    int anchoPantalla = too.width - 960;
    int altoPantalla = too.height;
}
