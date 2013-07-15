

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

   

public class Funciones {

    

public static void main(String[] args) throws NumberFormatException,IOException {
BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Escoja una de las siguientes funciones:");
    System.out.println("1.Tangente");
    System.out.println( "2.Cotangente");
    System.out.println("3.Secante");
    System.out.println("4.Cosecante");
    
    int conversiones = Integer.parseInt(lectura.readLine());
  

    switch (conversiones) {
        case 1:
        Tangente();
        break;
            
        case 2:
        Cotangente();
        break;    
            
        case 3:
        Secante();
        break;   
            
        case 4:
        Cosecante();
        break;   
        default:
        System.out.println("Eleccion Incorrecta");
    }
}

         static void Tangente() throws IOException {
         BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
         double angulo;
         double res;
         System.out.println("Ingresar el valor del angulo :");
         angulo = Integer.parseInt(lectura1.readLine());
         res = Math.tan(angulo * 2.0 * Math.PI / 360.0);
         System.out.println("la tangente del angulo" + angulo + "es" + res);
         }
   
        static void Cotangente() throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        System.out.println("Ingresar el valor del angulo");
        double angulo = Double.parseDouble(br.readLine());
        double cot = 1 / Math.tan(angulo);
        System.out.println("la Cotangente de angulo "+angulo + "es" + cot);
        }

        static void Secante() throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        System.out.println("Ingresar el valor del angulo");
        double angulo = Double.parseDouble(br.readLine());
        double sec = 1 / Math.cos(angulo);
        System.out.println("El valor de Cosecante " + "es" + sec);
        }

        static void Cosecante() throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        System.out.println("inserta los grados");
        double angulo = Double.parseDouble(br.readLine());
        double cos = 1 / Math.sin(angulo);
        System.out.println("El valor de Cosecante " + cos);
            }

        }

  
    
  
