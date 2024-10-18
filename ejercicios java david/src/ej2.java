import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        System.out.println("Introduce tu año de nacimiento, te diremos tu edad");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2024;
        int edad = b-a;
        System.out.println("Tu edad es "+edad);
    }
}
