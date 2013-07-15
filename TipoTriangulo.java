

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TipoTriangulo {

    static void ingresar() throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        double hypo1=0;
        double hypo = 0;
        double cateto1 = 0;
        double cateto2 = 0;
        System.out.println("Ingresar Cateto Opuesto");
        cateto1 = Integer.parseInt(lectura.readLine());
        System.out.println("Ingresar Cateto Adyacente");
        cateto2 = Integer.parseInt(lectura.readLine());
        hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa de un triangulo de lados " + cateto1 + " y " + cateto2 + " es " + hypo);


        if (hypo == Math.hypot(cateto1, cateto2)) {
            System.out.println("Es un triangulo Rectangulo");
        }
        if (hypo < Math.hypot(cateto1, cateto2)) {
            System.out.println("Es un triangulo Acutangulo");
        }
        if (hypo > Math.hypot(cateto1, cateto2)) {

            System.out.println("Es un triangulo Obtusangulo");
        }
    
    }
    public static void main(String[] args) throws IOException {

        Tipo_de_triangulo miObjeto;
        miObjeto = new Tipo_de_triangulo();
        Tipo_de_triangulo.ingresar();

       

    }
}
