import java.util.Scanner;

public class ej48buclesPrimo {
    public static void main(String[] args) {

        //Declaracion de variables
        int num;
        boolean primo = true ;
        int i;
        Scanner sc = new Scanner(System.in);


        //Bucle comprobacion num es positivo
        do{
            //Solicitamos numero num(int)
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
        }while(num <=0);


        //comprobamos todas las posibilidades de divisores entre 2 y n-1; Si hay un divisor o más es primo
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) { //Para primo false: no se encontraron más divisores
            System.out.printf("El numero %d es primo",num);
        }else{ //Para primo true: hay + de un divisor entre 2 y n-1
            System.out.printf("El numero %d no es primo",num);
        }

    }
}
