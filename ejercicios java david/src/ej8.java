import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int num;
        boolean par;
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        par = num % 2 == 0;

        System.out.println("El mayor edad es: " + par);

    }
}
