import java.util.Scanner;

public class ej56string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n ;
        char   digito;
        boolean encontrado = false;

        System.out.println("Introduce n");
        n = sc.nextLine();

        System.out.println("Introduce digitos");
        digito = sc.next().charAt(0);

        for (int i = 0; i < n.length(); i++) {
            if (digito == n.charAt(i)) {
                encontrado = true;
                System.out.println(i + 1 +" ");
            }

        }

        if (!encontrado) {
            System.out.println("El digito no se encuentra en el numero");
        }

    }
}
