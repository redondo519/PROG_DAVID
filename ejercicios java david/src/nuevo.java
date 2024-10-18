import java.util.Scanner;

public class nuevo {
    public static void main(String[] args) {
        int num1 = 1;
        int i = 1;
        int t = num1*i;
        System.out.println("Tabla de Multiplicar del numero introducido ");
        System.out.println("Introduce un numero del cual sacaremos su tabla de multiplicar");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("1x"+num1+"="+t);
    }
}
