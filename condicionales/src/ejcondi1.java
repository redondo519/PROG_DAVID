
//Es necesario importar la utilidad de escaner para leer datos
import javax.swing.*;
import java.util.Scanner;

public class ejcondi1 {
    public static void main(String[] args) {

        //Declariacion de variable ENTERA para numero especificado
        int num ;

        //Solicitamos numero
        System.out.println("Introduce un número para comprobar su paridad  ");

        //Leemos numero y lo guardamos en num(int)
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //Comprobamos paridad
        if (num % 2 == 0) {
            System.out.printf("El numero %d es par ",num);
        }else{
            System.out.printf("El numero %d es impar: ",num);
        }


    }
}
