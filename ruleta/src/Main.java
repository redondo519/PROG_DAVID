import java.util.Random;
import java.util.Scanner;

public class Main {
    private int balance;
    private Random random;
    private Scanner scanner;

    public Main() {
        this.balance = 0;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void jugar() {
        System.out.println("Bienvenido a la ruleta de casino!");
        System.out.println("Tu balance actual es: " + balance);

        while (true) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Realizar una apuesta");
            System.out.println("2. Ver balance");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarApuesta();
                    break;
                case 2:
                    verBalance();
                    break;
                case 3:
                    System.out.println("Gracias por jugar!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, inténtalo de nuevo.");
            }
        }
    }

    private void realizarApuesta() {
        System.out.println("¿Cuánto deseas apostar?");
        int apuesta = scanner.nextInt();

        if (apuesta <= 0) {
            System.out.println("La apuesta debe ser mayor que 0.");
            return;
        }

        System.out.println("¿Qué tipo de apuesta deseas realizar?");
        System.out.println("1. Rojo");
        System.out.println("2. Negro");
        System.out.println("3. Par");
        System.out.println("4. Impar");
        System.out.println("5. Alto");
        System.out.println("6. Bajo");

        int tipoApuesta = scanner.nextInt();

        int resultado = random.nextInt(37);

        switch (tipoApuesta) {
            case 1:
                if (resultado % 2 == 0 && resultado != 0) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            case 2:
                if (resultado % 2 != 0 && resultado != 0) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            case 3:
                if (resultado % 2 == 0) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            case 4:
                if (resultado % 2 != 0) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            case 5:
                if (resultado >= 19) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            case 6:
                if (resultado < 19) {
                    balance += apuesta;
                    System.out.println("Ganaste! Tu nuevo balance es: " + balance);
                } else {
                    balance -= apuesta;
                    System.out.println("Perdiste. Tu nuevo balance es: " + balance);
                }
                break;
            default:
                System.out.println("Opción inválida. Por favor, inténtalo de nuevo.");
        }
    }

    private void verBalance() {
        System.out.println("Tu balance actual es: " + balance);
    }

    public static void main(String[] args) {
        Main ruleta = new Main();
        ruleta.jugar();
    }
}