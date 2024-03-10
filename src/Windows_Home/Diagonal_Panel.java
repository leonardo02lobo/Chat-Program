package Windows_Home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Diagonal_Panel extends JPanel{
    
    public Diagonal_Panel(){
        super.setLayout(null);
        super.setSize(width,height);
        super.setLocation(0,100);
        super.setBackground(new Color(10, 15, 20));
        init();
    }
    private void init() {
        initLabel(labelChat, getWidth()/7+1, 20, widthImg, heightImg, imgChat);
        initLabel(labelCommunity, getWidth()/7+1, 140, widthImg, heightImg, imgCommunity);
        initLabel(labelIA, getWidth()/7+1, 260, widthImg, heightImg, imgIA);
        initLabel(labelCompiler, getWidth()/7+1, 380, widthImg, heightImg, imgCompiler);
    }

    private void initLabel(JLabel label, int x, int y, int width, int height, Image img) {
        label.setIcon(new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        label.setBounds(x, y, width, height);
        super.add(label);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource().equals(labelChat)){
                    Window_Home.Posicion = 0;
                }else if(e.getSource().equals(labelCommunity)){
                    Window_Home.Posicion = 1;
                }else if(e.getSource().equals(labelIA)){
                    Window_Home.Posicion = 2;
                }else if(e.getSource().equals(labelCompiler)){
                    Window_Home.Posicion = 3;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    Dimension too = super.getToolkit().getScreenSize();
    private final int width = too.width / 2 - 550;
    private final int height = too.height - 140;
    private final int widthImg = 100;
    private final int heightImg = 100;
    Image imgChat = new ImageIcon(getClass().getResource("../Multimedia/Icon-Message-modified.png")).getImage();
    Image imgCommunity = new ImageIcon(getClass().getResource("../Multimedia/Icon-Community-modified.png")).getImage();
    Image imgIA = new ImageIcon(getClass().getResource("../Multimedia/Icon-IA-modified.png")).getImage();
    Image imgCompiler = new ImageIcon(getClass().getResource("../Multimedia/Icon-Settings-modified.png")).getImage();
    JLabel labelChat = new JLabel();
    JLabel labelCommunity = new JLabel();
    JLabel labelIA = new JLabel();
    JLabel labelCompiler = new JLabel();
}
