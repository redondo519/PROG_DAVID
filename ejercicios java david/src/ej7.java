import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int edad;
        boolean mayorEdad;
        System.out.println("Ingrese su edad: ");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
        mayorEdad = edad >= 18;
        System.out.println("El mayor edad es: " + mayorEdad);

    }
}
