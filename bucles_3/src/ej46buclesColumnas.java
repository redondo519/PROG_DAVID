import java.util.Scanner;

public class ej46buclesColumnas {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int n;
        int cuad, cubo;

        //Solicitamos numero para calculos en columnas
        System.out.println("Introduce un numero: ");
        n = entrada.nextInt();

        //bucle para hayar los siguentes 5 numeros enteros
        for (int i = n + 1; i < n + 6; i++) {
            cuad = i * i;
            cubo = i * i * i;

            System.out.printf("numero introducido %d \t cuadrado: %d  \t   cubo:  %d \t",i,cuad,cubo);
            System.out.println();

        }
    }
}