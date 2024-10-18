
import java.util.Scanner;

public class ejcondi4 {
    public static void main(String[] args) {

        //Declariacion de variable decimal
        double num ;

        //Solicitamos numero
        System.out.println("Introduce un numero decimal (ejemplo 1.3): ");

        //Almacenamos numeros decimales
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();


        //Condicional: Comprobamos si el numero se encuentra entre -1 y 1; sin ser 0
        if ( ((num > 0 && num < 1) || (num < 0 && num > -1)) && (num!=0) ) {
            System.out.println("El numero es casi 0  ");
        }else{
            System.out.println("El numero no es un 'casi 0'");
        }

    }
}
