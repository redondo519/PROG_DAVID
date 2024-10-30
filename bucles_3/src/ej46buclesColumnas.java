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

        for (int i = n + 1; i < n + 6; i++) {
            cuad = i * i;
            cubo = i * i * i;
            System.out.print("numero introducido: " + n + "    \t");
            System.out.printf("cuadrado de %d :  %d \t",i,cuad);
            System.out.printf("cubo de %d :  %d \t ",i,cubo);
            System.out.println();

        }
    }
}