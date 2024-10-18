import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {

        int mb; //Almacena Megabits
        int kb; //Alacena Kilobits

        System.out.println("Transformar Megabits en Kilobits");
        System.out.println("Introduce megabits (mb): ");

        Scanner sc = new Scanner(System.in);
        mb = sc.nextInt();

        kb = (mb / 1024);

        System.out.println(mb + "Mb=" + kb + "Kb");
    }
}
