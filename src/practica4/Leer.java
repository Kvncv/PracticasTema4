package practica4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leer {

    public static String dato() {
        String sdato = "";
        try {
            sdato = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    public static int datoInt() {
        return Integer.parseInt(dato());
    }

    public static float datoFloat() {
        return Float.parseFloat(dato());
    }

    public static double datoDouble() {
        return Double.parseDouble(dato());
    }

    public static char datoChar() {
        return dato().charAt(0);
    }

    public static long datoLong() {
        return Long.parseLong(dato());
    }

    public static short datoShort() {
        return Short.parseShort(dato());
    }

    public static byte datoByte() {
        return Byte.parseByte(dato());
    }

    public static boolean datoBoolean() {
        return Boolean.parseBoolean(dato());
    }
}
