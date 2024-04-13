package Chat;

import Ventana_De_Inicio.*;
import utilidades_del_programa.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();

    public Panel_Chat() {
        super.setLayout(null);
        super.setLocation(0, 0);
        Timer tiempo = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Variables_Globales.Color);
                usuario.setForeground(Variables_Globales.ColorLetras);
                cajaDeMensaje.setBounds(20, altoPantalla - 100, anchoPantalla - 150, 40);
                setSize(anchoPantalla, altoPantalla);
            }
        });
        tiempo.start();
        init();
    }

    private void init() {
        iniciarCajaDeMesaje(cajaDeMensaje);
        iniciarTexto(usuario, 20, 20, 100, 100, "Usuario");
        iniciarBoton(enviar, anchoPantalla - 120, altoPantalla - 100, 100, 40, "Enviar");
        iniciarBotonCambio(cambioParaIA, anchoPantalla / 2, 40, 150, 40, "Compilador");
    }

    private void iniciarCajaDeMesaje(JTextField caja) {
        caja.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 30));
        super.add(caja);
    }

    private void iniciarBoton(JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        super.add(boton);
    }

    private void iniciarBotonCambio(JToggleButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 15));
        super.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Inicio.panel.removeAll();
                Ventana_Inicio.panel.add(new Panel_Compilador(), BorderLayout.CENTER);
                Ventana_Inicio.panel.revalidate();
                Ventana_Inicio.panel.repaint();
            }
        });
    }

    private void iniciarTexto(JLabel label, int x, int y, int ancho, int alto, String texto) {
        label.setText(texto);
        label.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        label.setBounds(x, y, ancho, alto);
        super.add(label);
        JPanel panel = this;
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (bandera) {
                    anchoPantalla -= 406;
                    cambiarUsuarioInformacion(panel);
                    init();
                    bandera = false;
                }
            }
        });
    }

    public static void cambiarUsuarioInformacion(JPanel panel) {
        Ventana_Inicio.panel.removeAll();
        Ventana_Inicio.panel.add(new Panel_Usuario_Informacion(), BorderLayout.CENTER);
        Ventana_Inicio.panel.add(panel);
        Ventana_Inicio.panel.revalidate();
        Ventana_Inicio.panel.repaint();
    }

    public static void cambiarPanelChatCompleto(JPanel panel) {
        Ventana_Inicio.panel.removeAll();
        Ventana_Inicio.panel.add(panel, BorderLayout.CENTER);
        Ventana_Inicio.panel.revalidate();
        Ventana_Inicio.panel.repaint();
    }

    private JTextField cajaDeMensaje = new JTextField();
    private JLabel usuario = new JLabel();
    JButton enviar = new JButton();
    public int anchoPantalla = too.width - 380;
    private int altoPantalla = too.height;
    public static boolean bandera = true;
    JToggleButton cambioParaIA = new JToggleButton();
}
