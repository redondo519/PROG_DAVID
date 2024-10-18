import java.util.Scanner;

public class ejcondi5 {
    public static void main(String[] args) {

        //Declariacion de variables enteras
        int num1 ;
        int num2 ;

        //Solicitamos numeros
        System.out.println("Introduce dos numeros: ");

        //Almacenamos numeros
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //Condicional
        if (num1 < num2) {
            System.out.printf(" %d  %d",num2,num1);
        }else if (num1 > num2) {
            System.out.printf(" %d  %d",num1,num2);
        }else{
            System.out.println("Los numeros son iguales ");
        }

    }
}
