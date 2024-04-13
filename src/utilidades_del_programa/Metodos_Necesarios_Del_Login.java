package utilidades_del_programa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Metodos_Necesarios_Del_Login {

    public static void iniciarLabel(JPanel panel, JLabel label, int x, int y, int ancho, int alto, String texto) {
        label.setText(texto);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setForeground(Variables_Globales.ColorLetras);
        label.setBounds(x, y, ancho, alto);
        panel.add(label);
    }

    public static void iniciarCajasDeTexto(JPanel panel, JTextField textField, int x, int y, int ancho, int alto) {
        textField.setBounds(x, y, ancho, alto);
        textField.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        panel.add(textField);
    }

    public static void iniciarCheck(JPanel panel, JCheckBox check, int x, int y, int ancho, int alto, String texto) {
        check.setText(texto);
        check.setBounds(x, y, ancho, alto);
        Timer tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check.setForeground(Variables_Globales.ColorLetras);
            }
        });
        tiempo.start();
        check.setOpaque(false);
        check.setBackground(Variables_Globales.Color);
        panel.add(check);
    }
}
