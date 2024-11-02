import java.util.Scanner;

public class ej48buclesPrimo {
    public static void main(String[] args) {

        //Declaracion de variables
        int num;
        boolean primo = true ;
        int i;
        Scanner sc = new Scanner(System.in);


        //Solicitamos numero num(int)
        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.printf("El numero %d es primo",num);
        }else{
            System.out.printf("El numero %d no es primo",num);
        }



       



    }
}
