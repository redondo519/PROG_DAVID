import java.util.Scanner;

public class ej38_bucles_letraMm {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        char letra;

        //Solicitar letra
        System.out.println("Introduce uma letra: ");
        letra = sc.next().charAt(0);

        //condicio saber si es vocal o consonante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("vocal");
        }else{
            System.out.println("consonante");
        }
    }
}
