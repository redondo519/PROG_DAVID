import java.util.Scanner;

public class ej38_2 {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        char letra;

        //Solicitar letra
        System.out.println("Introduce uma letra: ");
        letra = sc.next().toLowerCase().charAt(0);

        //condicio saber si es vocal o consonante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
            System.out.println(letra + " vocal");
        }else{
            System.out.println(letra + " consonante");
        }
    }
}
