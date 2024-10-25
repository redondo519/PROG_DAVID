import java.util.Scanner;

public class ej31esPrimo {
    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int n;
        int p = 0;
        int i = 0;

        //Solicitamos n
        System.out.print("Ingrese un numero, te diremos si es primo: ");
        n = sc.nextInt();

        //comprobacion
        do{
            i++;
            if (n%i==0){
                p++;
            }


        }while(i<n);

        if (p<=2){
            System.out.println("Es primo");
        }

    }
}
