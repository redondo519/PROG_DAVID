import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad, te diremos la que tendrás el año que viene");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        edad = edad + 1;
        System.out.println("Tu edad será "+edad);
    }
}
