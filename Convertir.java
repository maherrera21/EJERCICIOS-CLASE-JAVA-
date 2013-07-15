

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Convertir {

    public static void main(String[] args) throws IOException {
        double valor = 0;
        int opc = 0;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el numero de la opercion que desee");
        System.out.println("\n " + 1 + " si es Metros"
                + "\n " + 2 + " Si es Yardas"
                + "\n " + 3 + " Si es Pulgadas"
                + "\n " + 4 + " si es Pies");
        opc = Integer.parseInt(lectura.readLine());

        switch (opc) {
            case 1:
                Metros();
                break;
            case 2:
                Yardas();
                break;
            case 3:
                Pulgadas();
                break;
            case 4:
                Pies();
                break;
            default:
                System.out.println("Ingresar un numero entre 1&3");
        }

    }

    static void Metros() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        double metros;
        double res;
        System.out.println("Ingresar el valor en metros :");
        metros = Integer.parseInt(lectura1.readLine());
        double yd = metros * 1.0936;
        double pulg = metros * 39.370;
        double pies = metros *3.2808;

        System.out.println("\nValor en Yardas de: "+metros+"m :"+"es :" + yd+
                "\nValor en Pulgadas: "+metros+"m :"+"es :"+pulg+
                "\nValor en pies: "+metros+"m :"+"es :"+pies);
    }

    static void Yardas() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        double Yardas;
        double res;
        System.out.println("Ingresar el valor en Yardas :");
        Yardas = Integer.parseInt(lectura1.readLine());
        double metros = Yardas / 1.0936;
        
        double pulg = Yardas* 36.000;
        double pies = Yardas * 3.0000;
         System.out.println("\nValor en Metros de: "+Yardas+"yd :"+"es :" + metros+
                "\nValor en Pulgadas de: "+Yardas+"yd :"+"es :"+pulg+
                "\nValor en pies de: "+Yardas+"yd :"+"es :"+pies);
    }

    static void Pulgadas() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        double pulgadas;
        double res;
        System.out.println("Ingresar el valor en Pulgadas :");
        pulgadas = Integer.parseInt(lectura1.readLine());
        double metros = pulgadas / 39.370;
        
        double yardas =pulgadas *  0.027778;
        double pies = pulgadas * 0.083333;
         System.out.println("\nValor en Metros de: "+pulgadas+"pul :"+"es :" + metros+
                "\nValor en Yardas de: "+pulgadas+"pul :"+"es :"+yardas+
                "\nValor en pies de: "+pulgadas+"pul :"+"es :"+pies);
    }

    static void Pies() throws IOException {
        BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
        double Pies;
        double res;
        System.out.println("Ingresar el valor en Pulgadas :");
        Pies = Integer.parseInt(lectura1.readLine());
        double metros = Pies / 3.2808;        
        double yardas = Pies*  0.33333;
        double pulgadas = Pies * 12.000;
         System.out.println("\nValor en Metros de: "+Pies+"ft :"+"es :" + metros+
                "\nValor en Yardas de: "+Pies+"ft :"+"es :"+yardas+
                "\nValor en Pulgadas de: "+Pies+"ft :"+"es :"+pulgadas);
    }
}
