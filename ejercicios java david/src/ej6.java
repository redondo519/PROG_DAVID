import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        System.out.println("Introduce el radio de una circunferencia");
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        double l = 2*3.14*radio;
        double a = 3.14*(radio*radio);
        System.out.println("El radio de una circunferencia es: " + radio);
        System.out.println("Area de la circunferencia: " + a);
        System.out.println("Longitud de la circunferencia: " + l);
    }
}
