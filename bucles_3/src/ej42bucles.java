import java.util.Scanner;

public class ej42bucles {
    public static void main(String[] args) {
        //Declaracion de variables
        char caracter;
        Scanner sc = new Scanner(System.in);

        //Solicitud de caracter para la piramide
        System.out.println("Introduce un caracter para escoger el tipo de la piramide: ");
        caracter = sc.next().charAt(0);

        //Creacion de pirámide
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(caracter);
            }

        }
//TERMINAR



    }

}
