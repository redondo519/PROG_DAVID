import java.util.Scanner;

public class ej43_bucles_PrimeraCifra {
    public static void main(String[] args) {

        //Declaracion de variables
        int n;
        Scanner sc = new Scanner(System.in);

        //Solicitar numero n(int)
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();

        while(n > 10){

            n = n/10;

        }
        System.out.println(n);

    }
}
