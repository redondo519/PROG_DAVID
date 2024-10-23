import java.util.Scanner;

public class ejbucle2 {
    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        int n = 1;
        boolean par = false;
        boolean positivo = false;


        //Bucle hasta que n valga 0

        do{

            //Solicitamos numero
            System.out.println("Ingrese el primer numero: ");
            n = sc.nextInt();

            //Comprobacion si es par
            if (n % 2 == 0) {
                par = true;
            }
            if (n >= 0) {
                positivo = true;
            }

            //Mostar resultado
            System.out.println(n + " es par : " + par);
            System.out.println(n + " es positivo : " + positivo);
            System.out.println(n + " elevado a 2 es : " + Math.pow(n, 2));
        }while (n!=0);
    }
}
