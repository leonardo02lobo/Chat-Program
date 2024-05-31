package Ventana_De_Inicio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import utilidades_del_programa.Variables_Globales;

public class Panel_Comunidad extends JPanel{
    
    Dimension too = super.getToolkit().getScreenSize();

    //panel que generara el apartado de comunidad del programa donde el usuario podra acceder a chat privados de manera libre
    public Panel_Comunidad() {
        super.setLayout(null);
        super.setBackground(Color.GRAY);
        super.setLocation(0, 0);
        Timer tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Variables_Globales.Color);
                if (Panel_Diagonal_Busqueda.band) {
                    setSize(anchoPantalla, altoPantalla);
                } else {
                    setSize(anchoPantalla + Panel_Diagonal_Busqueda.ancho + 380, altoPantalla);
                }
            }
        });
        tiempo.start();
    }
    int anchoPantalla = too.width-380;
    int altoPantalla = too.height;
}
