

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjerciciosClase {

    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.println("1. MULTIPLICACIÓN");
        System.out.println("2. RESTA");
        System.out.println("3. SUMA");
        System.out.println("4. DIVISIÓN");


        System.out.println(">>> QUÉ OPERACIÓN DESEA? ");
        int operacion = Integer.parseInt(lectura.readLine());
        switch (operacion) {
            case 1:
                multiplicacion();
                break;
            case 2:
                resta();
                break;
            case 3:
                suma();
                break;
            case 4:
                division();
                break;

            default:
                System.out.println("Eleccion Incorrecta");
        }
    }

    public static void multiplicacion() throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.print("Inserte el número de tabla del 1 al 10:");
        int Numero = Integer.parseInt(num.readLine());
        System.out.println("Tabla del " + Numero + "");
        int i;

        i = 1;

        for (i = 0; i <= 12; i++) {

            System.out.println(Numero + " * " + i + " = " + (Numero * i));

        }
    }

    public static void resta() throws IOException {
        BufferedReader num1 = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.print("Inserte el número de tabla del 1 al 10:");
        int Numero = Integer.parseInt(num1.readLine());
        System.out.println("Tabla del " + Numero + "");
        int i;

        i = 1;

        for (i = 0; i <= 12; i++) {

            System.out.println(Numero + " - " + i + " = " + (Numero - i));

        }
    }

    public static void suma() throws IOException {
        BufferedReader num2 = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.print("Inserte el número de tabla del 1 al 10:");
        int Numero = Integer.parseInt(num2.readLine());
        System.out.println("Tabla del " + Numero + "");
        int i;

        i = 1;

        for (i = 0; i <= 12; i++) {

            System.out.println(Numero + " + " + i + " = " + (Numero + i));

        }
    }

    public static void division() throws IOException {
        BufferedReader num3 = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.print("Inserte el número de tabla del 1 al 10:");
        int Numero = Integer.parseInt(num3.readLine());
        System.out.println("Tabla del " + Numero + "");

        float i;

        i = 1;

        for (i = 0; i <= 12; i++) {

            System.out.println(Numero + " / " + i + " = " + (Numero / i));

        }

    }
}
