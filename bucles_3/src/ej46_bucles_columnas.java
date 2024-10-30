import java.util.Scanner;

public class ej46_bucles_columnas {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int n;
        int cuad;

        //Solicitamos numero para calculos en columnas
        System.out.println("Introduce un numero: ");
        n = entrada.nextInt();
        cuad = n*n;
        System.out.println("%d %d elevado a 2 = " , n ,cuad);
    }
}
