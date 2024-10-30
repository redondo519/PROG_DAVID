import java.util.Scanner;

public class ej43_bucles_PrimeraCifra {
    public static void main(String[] args) {

        //Declaracion de variables
        int n;
        Scanner sc = new Scanner(System.in);




        //comprobacion, numero menor de 6 cifras
        do{
            System.out.println("Introduce un numero: ");
            n = sc.nextInt();
        }while(n < 0 || n > 9999999);

        while(n > 10){

            n = n/10;

        }
        System.out.println(n);

    }
}
