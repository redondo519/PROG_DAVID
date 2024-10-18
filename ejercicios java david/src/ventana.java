import java.util.Scanner;

public class ventana {
    public static void main(String[] args) {
        int edad = 0;
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Nombre :"+nombre);
        System.out.printf("Tienes %d años",edad); // printf con el parametro %d detecta un entero

    }
}
