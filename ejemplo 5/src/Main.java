import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        double b = s.nextDouble();

        double cuadrado = b * b; // calculate the square of the input number

        System.out.println("El cuadrado del numero es: " + cuadrado);
    }
}