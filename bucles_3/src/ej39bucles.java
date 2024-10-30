import java.util.Scanner;

public class ej39bucles {
    public static void main (String[] args) {

        //pide un numero, muestra impares desde 1 hasta n

        //declaracion de variable entera y variable para escaner
        int n;
        Scanner sc = new Scanner(System.in);


        //Solicitud de n
        System.out.println("Introduce un numero, te diremos que numeros son impares entre 1 y dicho numero");
        n = sc.nextInt();

        //Bucle for hay todos los numeros desde 1-n
        for (int i = 1; i <= n; i++) {

            //condicion, muestra solo los numeros impares
            if (i % 2 != 0) {

                System.out.println(i);
            }

        }

    }
}
