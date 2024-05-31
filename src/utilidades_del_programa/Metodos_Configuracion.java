package utilidades_del_programa;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Metodos_Configuracion {
    
    //inicial los label del panel de configuracion
    public static void iniciarComponentes(JPanel panel,JLabel label,int x, int y, int ancho, int alto, String texto){
        label.setText(texto);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Variables_Globales.ColorLetras);
        panel.add(label);
    }
}
