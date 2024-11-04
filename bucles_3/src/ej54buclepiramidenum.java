import java.util.Scanner;

public class ej54buclepiramidenum {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int n;


        do{
            System.out.println("Ingrese un numero positivo");
            n = sc.nextInt();
        }while(n <= 0);




        for (int i = 1; i <= n; i++) {
            //Espacios en blanco
            for(int j = 0; j < n - i; j++){
                System.out.print("  ");
            }

            System.out.println();

        //Numeros ascendentes
            for(int j = 1; j <= i; j++){

                System.out.print(j + " ");

            }

        //Numeros descendentes
            for(int j = i-1; j >= 1; j--){

                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
