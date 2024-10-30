import java.util.Scanner;

public class ej46_bucles_columnas {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int n;
        int cuad,cubo;

        //Solicitamos numero para calculos en columnas
        System.out.println("Introduce un numero: ");
        n = entrada.nextInt();

        for (int i = n+1; i < n+6; i++) {
            cuad = i*i;
            cubo = i*i*i;
            System.out.println("numero calculado: "+i+ "    ");
            System.out.print("cuad: ");
            System.out.println(cuad);
            System.out.print("cubo: ");
            System.out.println(cubo);

        }



    }
}
