import java.util.Scanner;

public class ej37_while {
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

        while(i <= n) {

            fact = fact * i;
            i++;

        }
        System.out.println(fact);

    }
}