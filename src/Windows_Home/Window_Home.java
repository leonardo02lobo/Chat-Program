package Windows_Home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window_Home extends JPanel {

    public Window_Home() {
        super.setSize(too);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        super.add(Bar);
        init();
        CurrentPanel();
    }
    
    private void init() {
        initLabel(labelChat, 20, 120, widthImg, heightImg, imgChat);
        initLabel(labelCommunity, 20, 240, widthImg, heightImg, imgCommunity);
        initLabel(labelIA, 20, 360, widthImg, heightImg, imgIA);
        initLabel(labelCompiler, 20, 480, widthImg, heightImg, imgCompiler);
    }

    private void initLabel(JLabel label, int x, int y, int width, int height, Image img) {
        label.setIcon(new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        label.setBounds(x, y, width, height);
        super.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource().equals(labelChat)){
                    Posicion = 0;
                }else if(e.getSource().equals(labelCommunity)){
                    Posicion = 1;
                }else if(e.getSource().equals(labelIA)){
                    Posicion = 2;
                }else if(e.getSource().equals(labelCompiler)){
                    Posicion = 3;
                }
            }
        });
    }

    private void CurrentPanel() {
        switch (Posicion) {
            case 0:
                Change_Panels(chat);
                content = chat;
                break;
            case 1:
                Change_Panels(community);
                content = community;
                break;
            case 2:
                Change_Panels(ia);
                content = ia;
                break;
            case 3:
                Change_Panels(compiler);
                content = compiler;
                break;
            case 4:
                Change_Panel_Settings(user, content);
                break;
            case 5:
                Change_Panel_Settings(friend, content);
                break;
        }
    }

    private void Change_Panels(JPanel panel) {
        super.removeAll();
        super.add(panel, BorderLayout.CENTER);
        super.add(Bar);
        init();
        super.revalidate();
        super.repaint();
    }

    private void Change_Panel_Settings(JPanel panel, JPanel content) {
        super.removeAll();
        super.add(panel, BorderLayout.CENTER);
        init();
        super.add(content);
        super.add(Bar);
        super.revalidate();
        super.repaint();
    }

    Dimension too = super.getToolkit().getScreenSize();
    public static int Posicion;
    private final int widthImg = 100;
    private final int heightImg = 100;
    private final Image imgChat = new ImageIcon(getClass().getResource("../Multimedia/Icon-Message-modified.png")).getImage();
    private final Image imgCommunity = new ImageIcon(getClass().getResource("../Multimedia/Icon-Community-modified.png")).getImage();
    private final Image imgIA = new ImageIcon(getClass().getResource("../Multimedia/Icon-IA-modified.png")).getImage();
    private final Image imgCompiler = new ImageIcon(getClass().getResource("../Multimedia/Icon-Settings-modified.png")).getImage();
    private final JLabel labelChat = new JLabel();
    private final JLabel labelCommunity = new JLabel();
    private final JLabel labelIA = new JLabel();
    private final JLabel labelCompiler = new JLabel();
    private final Panel_Chat chat = new Panel_Chat();
    private final Panel_Community community = new Panel_Community();
    private final Navigation_Bar Bar = new Navigation_Bar();
    private final Panel_AI ia = new Panel_AI();
    private final Panel_Compiler compiler = new Panel_Compiler();
    private final Panel_Friend friend = new Panel_Friend();
    private final Panel_User user = new Panel_User();
    private JPanel content = new JPanel();
}
