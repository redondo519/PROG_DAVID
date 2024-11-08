import java.util.InputMismatchException;
import java.util.Scanner;

public class ejexcepciones63 {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");

        //Control de excepciones
        try{
            int num = sc.nextInt();
            double raiz = Math.sqrt(num);
            if(Double.isNaN(raiz)){
                //lanzar excepcion
                throw new ArithmeticException();
            }
            //mostar raiz
            System.out.println("La salida de la raiz cuadrada de "+num+" es "+raiz);

        //No es un numero
        }catch (InputMismatchException e){
            System.out.println("El numero introducido no es valido");
        }
        //es negativo
        catch (ArithmeticException e){
            System.out.println("no se puede calcular la raiz de un numero negativo");
        }
    }
}
