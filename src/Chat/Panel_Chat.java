package Chat;

import Ventana_De_Inicio.*;
import utilidades_del_programa.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Chat extends JPanel {

    Dimension too = super.getToolkit().getScreenSize();
    static Panel_Usuario_Informacion a = new Panel_Usuario_Informacion();

    public Panel_Chat() {
        super.setLayout(null);
        super.setLocation(0, 0);
        Timer tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(band){
                    if(anchoPantalla != anchoFinal){
                        anchoPantalla-= 2;
                    }
                }
                redimensionarComponentes();
            }
        });
        tiempo.start();
        init();
    }
    
    //este metodo se encargara de colocar los componentes swing de manera que este se redimensionen
    private void redimensionarComponentes(){
        setBackground(Variables_Globales.Color);
                usuario.setForeground(Variables_Globales.ColorLetras);
                cajaDeMensaje.setBounds(20, altoPantalla - 100, anchoPantalla - 220, 40);
                enviar.setBounds(anchoPantalla - 190, altoPantalla - 100, 100, 40);
                if (Panel_Diagonal_Busqueda.band) {
                    setSize(anchoPantalla, altoPantalla);
                } else {
                    setSize(anchoPantalla + Panel_Diagonal_Busqueda.ancho + 380, altoPantalla);
                }
    }

    private void init() {
        iniciarCajaDeMesaje(cajaDeMensaje);
        iniciarTexto(usuario, 20, 20, 100, 100, "Usuario");
        iniciarBoton(enviar, "Enviar");
        iniciarBotonCambio(cambioParaIA, anchoPantalla / 2, 40, 150, 40, "Compilador");
    }

    private void iniciarCajaDeMesaje(JTextField caja) {
        caja.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 30));
        super.add(caja);
    }

    private void iniciarBoton(JButton boton, String texto) {
        boton.setText(texto);
        boton.setFont(new Font(Variables_Globales.Tipo_Letra, 1, 20));
        super.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = cajaDeMensaje.getText();
                System.out.println(texto);
                cajaDeMensaje.setText("");
            }
        });
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
                    band = true;
                    cambiarUsuarioInformacion(panel);
                    init();
                    bandera = false;
                }
            }
        });
    }

    public static void cambiarUsuarioInformacion(JPanel panel) {
        Ventana_Inicio.panel.removeAll();
        Ventana_Inicio.panel.add(a, BorderLayout.CENTER);
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
    public static boolean band = false;
    int anchoFinal = anchoPantalla-406;
}
