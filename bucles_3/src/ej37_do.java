import java.util.Scanner;

public class ej37_do {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        int n ;
        long fact = 1;
        int i = 1;

        do {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        }while(n < 0);

        do {

            fact = fact * i;
            i++;

        }while(i<=n);
        System.out.println(fact);

    }
}