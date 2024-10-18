import java.util.Scanner;

public class ejcondi6 {
    public static void main(String[] args) {

        //Declariacion de variables enteras
        int num1 ;
        int num2 ;
        int num3 ;

        //Solicitamos numeros
        System.out.println("Introduce tres numeros: ");

        //Almacenamos numeros
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        //Condicional: Comprobamos cual es mayor para ordenar los numeros

        if (num1 > num2 && num1 > num3 && num2 > num3) {

            System.out.printf(" %d  %d %d", num1, num2, num3);

        }else{
            System.out.printf(" %d  %d %d", num2, num3, num1);
        }

        }










    }

