

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ParImpar {

    public static void main(String args[]) {
      
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);

       
        String datoEntrada;

        
        int num = 0;

    
        try {
            System.out.print("Ingrese un numero entero (0-20): ");
            datoEntrada = flujoEntrada.readLine();
            num = Integer.parseInt(datoEntrada);
        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        }

        switch (num) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:

                System.out.println("\nEl numero " + num + " es " + "Par");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
                System.out.println("\nEl numero " + num + " es " + "Impar");
                break;
            default:
                System.out.println("\nNo esta en el rango de 0 a 20");
        }
         
    }
}
