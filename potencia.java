
import java.io.*;
import java.lang.Math;


public class potencia {
  


public static void main(String args[])
{

        int j=0;
        double potencia =0;
        while(potencia<=8500){
        j=j+1;
        int base =2;
        double exponente=j;
        potencia = Math.pow(base, exponente);
        System.out.println("Potencia = " +potencia);
        }
    }
} 
