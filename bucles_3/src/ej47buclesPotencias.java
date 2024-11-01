import java.util.Scanner;

public class ej47buclesPotencias {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double real;
        int entero;

        //Solicitamos un numero real para la base
        System.out.print("Introduce un numero real para la base de la potencia: ");
        real = sc.nextDouble();
        System.out.print("Introduce un numero entero paara los exponentes de las potencias: ");
        entero = sc.nextInt();

        //Bucle para hayar exponentes
        if (entero > 0) {


            for (int i = 1; i <= entero; i++) {

                System.out.println(real + "^" + i);

            }

        }else{

            for (int i = entero; i <= 1; i++) {

                System.out.println(real + "^" + entero);

            }

        }
    }
}
