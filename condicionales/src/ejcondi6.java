import java.util.Scanner;

public class ejcondi6 {
    public static void main(String[] args) {

        //Declariacion de variables enteras
        int a ;
        int b ;
        int c ;

        //Solicitamos numeros
        System.out.println("Introduce tres numeros enteros: ");

        //Almacenamos numeros
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //Condicional: Comprobamos cual es mayor para ser el primero en mostar
        if (a > b && a > c){
            //Si el primero es a, comrobar cual es el mayor entre b y c para = SEGUNDO
            if (b > c){
                System.out.println("Orden mayor a menor: " + a + "," + b + "," + c);
            }else{
                System.out.println("Orden mayor a menor: " + a + "," + c + "," + b);
            }
        }

        //Comprobamos, si b es el mayor
        if (b > a && b > c){
            if (a > c){
                System.out.println("Orden mayor a menor: " + b + "," + a + "," + c);
            }else{
                System.out.println("Orden mayor a menor: " + b + "," + c + "," + a);
            }
        }

        //Comprobamos, si c es el mayor
        if (c > a && c > b){
            if (a > b){
                System.out.println("Orden mayor a menor: " + c + "," + a + "," + b);
            }else{
                System.out.println("Orden mayor a menor: " + c + "," + b + "," + a);
            }
        }

        if (a == b && a == c){
            System.out.println("Los numeros " + a + "," + b + "," + c + " son iguales");
        }

    }

}
