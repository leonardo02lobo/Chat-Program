package utilidades_del_programa;

import Configuracion.*;
import Chat.*;
import Ventana_De_Inicio.*;
import java.awt.*;
import javax.swing.*;

public class Variables_Globales {
    public final static String Tipo_Letra = "Arial";
    public static Color Color = new Color(20, 15, 20);
    public static Color ColorLetras = new Color(255, 255, 255);
    public static Panel_Chat Panel_Chat = new Panel_Chat();
    public static Panel_Comunidad Panel_Comunidad = new Panel_Comunidad();
    public static Panel_IA Panel_IA = new Panel_IA();
    public static Panel_Compilador Panel_compilador = new Panel_Compilador();
    public static Panel_Diagonal_Busqueda Panel_Diagonal = new Panel_Diagonal_Busqueda();
    public static Panel_Configuracion Panel_Configuracion = new Panel_Configuracion();
    public static Timer tiempo;
    public static byte Posicion = 10;
    public static byte CambiarIdioma = 0;
}
