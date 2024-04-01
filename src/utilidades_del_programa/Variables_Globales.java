package utilidades_del_programa;

import Configuracion.Panel_Configuracion;
import Chat.Panel_Chat;
import Ventana_De_Inicio.Panel_Diagonal;
import Ventana_De_Inicio.Panel_Comunidad;
import Ventana_De_Inicio.Panel_Compilador;
import Ventana_De_Inicio.Panel_IA;
import java.awt.*;
import javax.swing.*;

public class Variables_Globales {
    public final static String Tipo_Letra = "Arial";
    public static Color Color = new Color(10, 15, 20);
    public static Panel_Chat Panel_Chat = new Panel_Chat();
    public static Panel_Comunidad Panel_Comunidad = new Panel_Comunidad();
    public static Panel_IA Panel_IA = new Panel_IA();
    public static Panel_Compilador Panel_compilador = new Panel_Compilador();
    public static Panel_Diagonal Panel_Diagonal = new Panel_Diagonal();
    public static Panel_Configuracion Panel_Configuracion = new Panel_Configuracion();
    public static Timer tiempo;
    public static byte Posicion;
}
