import java.util.InputMismatchException;
import java.util.Scanner;

public class ejexcepciones62 {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner sc = new Scanner(System.in);
        String texto ;
        int numero;
//Control de excepciones
        try{
        //Solicitamos cadena de caracteres
        System.out.println("Introduzca una cadena de caracteres: ");
        texto = sc.nextLine();
        System.out.println("Introduzca una posicion para la cadena:  ");
        numero = sc.nextInt();


            System.out.println(texto.charAt(numero));
        }catch(InputMismatchException e){

            System.out.println("ERROR: Tiene que ser un numero");

        }
        catch(StringIndexOutOfBoundsException e){

            System.out.println("ERROR: El numeroes demasiado grande para la caddena ");

        }






    }
}
