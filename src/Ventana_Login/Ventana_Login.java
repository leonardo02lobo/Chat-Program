package Ventana_Login;

import Principal.App;
import utilidades_del_programa.Variables_Globales;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Login extends JPanel {

    public Ventana_Login() {
        super.setSize(App.ancho, App.alto);
        super.setLayout(null);
        super.setBackground(new Color(10, 15, 20));
        init();
    }

    private void init() {
        iniciarPaneles(Panel_Inicio_Seccion);
        iniciarLabel(IniciarSeccion, (getWidth() / 2) - 150, getHeight() - 600, 100, 30, "SIGN IN");
        iniciarLabel(linea, (getWidth() / 2) - 140, getHeight() - 585, 100, 30, "_____");
        iniciarLabel(Registrarse, (getWidth() / 2) + 50, getHeight() - 600, 100, 30, "SIGN UP");
    }

    private void iniciarLabel(JLabel label, int x, int y, int width, int height, String text) {
        label.setText(text);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setForeground(Color.cyan);
        label.setBounds(x, y, width, height);
        super.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (label.getText() == "SIGN IN") {
                    iniciarLabel(linea, (getWidth() / 2) - 130, getHeight() - 550, 100, 30, "_____");
                    iniciarPaneles(Panel_Inicio_Seccion);
                } else {
                    iniciarLabel(linea, (getWidth() / 2) + 70, getHeight() - 550, 100, 30, "_____");
                    iniciarPaneles(Panel_registrarse);
                }
            }
        });
    }
    
    private void iniciarPaneles(JPanel panel){
        removeAll();
        add(panel,BorderLayout.CENTER);
        revalidate();
        repaint();
        add(IniciarSeccion);
        add(Registrarse);
        add(linea);
    }

    Panel_Iniciar_Seccion Panel_Inicio_Seccion = new Panel_Iniciar_Seccion();
    Panel_Registrarse Panel_registrarse = new Panel_Registrarse();
    JLabel IniciarSeccion = new JLabel();
    JLabel Registrarse = new JLabel();
    JLabel linea = new JLabel();
}
