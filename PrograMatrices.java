
import java.util.Scanner;

public class PrograMatrices {

    private int M = 7;
    private int N = 7;
    private int P = 7;
    private int Matriz1[][] = new int[N][M];
    private int Matriz2[][] = new int[M][P];
    private int Matriz3[][] = new int[N][P];
    Scanner entrada = new Scanner(System.in);

    public void Entradas() {

        System.out.printf("\nEste programa multiplica una matriz de %d columnas y %d renglones", M, N);
        System.out.printf(" con una de %d columnas y %d renglones\n\n", P, M);
        System.out.print("\nAqui se reciben las entradas de la primera matriz ");
        System.out.printf("de %d filas y %d columnas.\n", M, N);


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("Introduzca el valor de la entrada en el renglon %d  y la columna %d: ", i + 1, j + 1);
                Matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.print("\nAqui se reciben las entradas de la segunda matriz ");
        System.out.printf("de  %d  filas y %d columnas", M, P);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                System.out.printf("Introduzca el valor en el renglon %d y la columna %d: ", i + 1, j + 1);
                Matriz2[i][j] = entrada.nextInt();
            } 
        }
    }

    public void Multiplicar() {

        for (int k = 0; k < N; k++) {
            for (int j = 0; j < P; j++) {
                for (int i = 0; i < M; i++) {
                    Matriz3[ k][j] += Matriz1[k][i] * Matriz2[i][j];
                }

            }
        }

    }

    void Imprimir() {
        int i, j, k;

        System.out.printf("\n\nMatrices y su producto \n\n");
        for (i = 0; i < N; i++) {

            for (k = 0; k < M; k++) { 
                System.out.printf("%3d", Matriz1[i][k]);
            }

            System.out.printf("\t\t");            

            for (j = 0; j < P; j++) {
                if (i <= (N - 1)) {
                    System.out.printf("%3d", Matriz2[i][j]); 
                } else {
                    System.out.printf(" ");
                }
            }

            System.out.printf("\t\t");
            for (j = 0; j < P; j++) {
                System.out.printf("%3d", Matriz3[i][j]);
            }

            System.out.printf("\n");
        }
        if (M > N) { 
            int l = N;

            while (l < M) { 
                for (i = 0; i < M; i++) {
                    System.out.printf(" ");
                }
                System.out.printf("\t\t\t");
                for (j = 0; j < P; j++) {
                    System.out.printf("%3d", Matriz2[l][j]);
                }
                System.out.printf("\n");
                l++;
            }
        }
    }

    public static void main(String args[]) {
        Matrices miObjeto;
        miObjeto = new Matrices();
        miObjeto.Entradas();
        miObjeto.Multiplicar();
        miObjeto.Imprimir();
    }
}
