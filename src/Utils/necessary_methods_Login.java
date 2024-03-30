package Utils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class necessary_methods_Login {

    public static void initLabel(JPanel panel, JLabel label, int x, int y, int width, int height, String text) {
        label.setText(text);
        label.setFont(new Font(Var_necessary.type, 1, 20));
        label.setForeground(Color.cyan);
        label.setBounds(x, y, width, height);
        panel.add(label);
    }

    public static void initTextField(JPanel panel, JTextField textField, int x, int y, int width, int height) {
        textField.setBounds(x, y, width, height);
        textField.setFont(new Font(Var_necessary.type, 1, 20));
        panel.add(textField);
    }

    public static void initCheck(JPanel panel, JCheckBox check, int x, int y, int width, int height, String text) {
        check.setText(text);
        check.setBounds(x, y, width, height);
        check.setForeground(Color.white);
        check.setOpaque(false);
        check.setBackground(new Color(10, 15, 20));
        panel.add(check);
    }
}
