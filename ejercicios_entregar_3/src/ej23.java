import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {

        double m; //Almacena metros
        double n; //Alacena millas marinas

        System.out.println("Transformar millas marinas a metros");
        System.out.println("Introduce millas marinas: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();

        m = n * 1852;

        System.out.println(m + " metros");
    }
}
