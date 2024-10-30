import java.util.Scanner;

public class ej37bucles {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        int n ;
        long fact = 1;

        do {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        }while(n < 0);

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
