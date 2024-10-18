

import java.util.Scanner;

public class ejcondi2 {
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

        //Comprobamos igualdad de los numeros
        if (num1 == num2) {
            System.out.printf("Los numeros %d y %d son iguales ",num1,num2); //%d muestra el valor de la variable en orden
        }else{
            System.out.printf("Los numeros %d y %d no son iguales ",num1,num2);
        }

    }
}
