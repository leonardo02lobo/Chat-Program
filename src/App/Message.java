package App;

import Utils.Var_necessary;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Message extends JLabel implements MouseListener {

    public Message(String message, boolean reader, String time,Color color, boolean VistePerson) {
        this.message = message;
        this.reader = reader;
        this.time = time;
        this.color = color;
        this.VistePerson = VistePerson;
        super.setBackground(color);
        super.setOpaque(true);
        super.setSize(200,50);
        super.setLocation(1000,450);
        createMessage();
        createTime();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isVistePerson() {
        return VistePerson;
    }

    public void setVistePerson(boolean VistePerson) {
        this.VistePerson = VistePerson;
    }
    
    public void createMessage() {
        CreateMessage.setText(getMessage());
        CreateMessage.setBackground(getColor());
        CreateMessage.setFont(new Font(Var_necessary.type, 1, 20));
        CreateMessage.setBounds(20,20,200,30);
        add(CreateMessage);
    }
    
    public void createTime(){
        CreateTime.setText(time);
        CreateTime.setFont(new Font(Var_necessary.type,1,12));
        CreateTime.setBounds(getWidth()-100,30,50,20);
        add(CreateTime);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(CreateMessage)) {

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
    
    private JLabel CreateMessage = new JLabel();
    private JLabel CreateTime = new JLabel();
    private String message;
    private boolean reader;
    private String time;
    private Color color;
    private boolean VistePerson;
}
