package Window;

//@author Lio
import Principal.App;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Navigation_Bar extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Navigation_Bar() {
        super.setSize(too.width, 100);
        super.setLayout(null);
        super.setLocation(0, 0);
        super.setBackground(new Color(10, 15, 20));
        init();
    }

    private void init() {
        System.out.println(getHeight());
        initLabel(labelUser, getWidth()-100, getHeight()/5, 60, 60, imgUser);
        initLabel(labelFriend, getWidth()-200, getHeight()/5, 60, 60, imgFriend);
    }
    
    private void initLabel(JLabel label, int x, int y, int width, int height, Image img) {
        label.setIcon(new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        label.setBounds(x, y, width, height);
        super.add(label);
    }

    Image imgFriend = new ImageIcon(getClass().getResource("../Multimedia/Icon-Friend.png")).getImage();
    Image imgUser = new ImageIcon(getClass().getResource("../Multimedia/Icon-User.png")).getImage();
    JLabel labelFriend = new JLabel();
    JLabel labelUser = new JLabel();

}
