package utilidades_del_programa;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Metodos_Configuracion {
    
    public static void iniciarComponentes(JPanel panel,JLabel label,int x, int y, int ancho, int alto, String texto){
        label.setText(texto);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Color.white);
        panel.add(label);
    }
}
