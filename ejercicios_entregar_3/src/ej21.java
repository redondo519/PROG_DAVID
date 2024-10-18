import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {

        int n1;
        int n2;

        System.out.println("Introduce dos números ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " Es mayor");
        } else {
            System.out.println(n2 + " Es mayor");
        }


    }
}
