

import java.util.Scanner;

public class ejcondi3 {
    public static void main(String[] args) {

        //Declariacion de variables enteras
        int num1 ;
        int num2 ;

        //Solicitamos numeros
        System.out.println("Introduce dos numeros: ");

        //Almacenamos numeros
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //Condicional para comprobar si los numeros son iguales o cual es mayor
        if (num1 == num2) {
            System.out.println("Los numeros son iguales ");
        }else if (num1 > num2) {
            System.out.printf(" %d > %d",num1,num2);
        }else{
            System.out.printf(" %d > %d",num2,num1);
        }

    }
}
