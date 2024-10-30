import java.util.Scanner;

public class ej40bucles {
    public static void main(String[] args) {

        //Saluda en funcion de la hora introducida

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int h;

        //Solicitud de hora completa
        System.out.println("Ingrese el valor de la hora:");
        h = sc.nextInt();



        if ((h<0) || (h>24)) {
            System.out.println("HORA MAL INTRODUCIDA");
        }else {


            //Rangos para el saludo
            if (h >= 6 && h <= 12) {

                System.out.println("BUENOS DÍAS");
                System.out.println("Son las " + h);

            } else if (h >= 13 && h <= 20) {

                System.out.println("BUENAS TARDES");
                System.out.println("Son las " + h);

            } else if (h >= 21 && h <= 24 || (h >= 0 && h <= 5)) {
                System.out.println("BUENAS NOCHES");
                System.out.println("Son las " + h);
            }

        }
    }
}

