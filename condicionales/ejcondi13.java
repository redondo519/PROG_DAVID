import java.util.Scanner;

public class ejcondi13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par
        boolean esPar = (numero % 2 == 0);

        // Verificar si el número es divisible entre 5
        boolean esDivisibleCinco = (numero % 5 == 0);

        // Mostrar el resultado mediante una dobe condicion OR ||
        if (esPar || esDivisibleCinco) {
            System.out.println("El numero es apto: " + numero);
        } else {
            System.out.println("El número no es apto, no es divisible entre 5 ni es par: " + numero);
        }

    }
}