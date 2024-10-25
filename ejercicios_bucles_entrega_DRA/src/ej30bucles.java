import javax.swing.*;
import java.util.Scanner;

public class ej30bucles {
    public static void main(String[] args) {

        //Declaracion e variables
        Scanner sc = new Scanner(System.in);
        double dinero;
        double suma = 0.0;

        //bucle hasta 0
        do {

            //Solicitamos dinero
            System.out.println("Introduzca cantidad dinero: ");
            dinero = sc.nextDouble();

            //Sumamos dinero
            suma = suma + dinero;

        }while(dinero != 0);

        //Mostramos resultado
        System.out.println("El total de su dinero es: " + suma);



    }
}
