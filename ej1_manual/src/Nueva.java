// MenuApp.java

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Comprobar la paridad de 10 números");
            System.out.println("3. Salir");

            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    sumarDosNumeros(scanner);
                    break;
                case 2:
                    comprobarParidadDiezNumeros(scanner);
                    break;
                case 3:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static void sumarDosNumeros(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("La suma es: " + sum);
    }

    private static void comprobarParidadDiezNumeros(Scanner scanner) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Números pares: " + countEven);
        System.out.println("Números impares: " + countOdd);
    }
}