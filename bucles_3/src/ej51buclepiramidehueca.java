import java.util.Scanner;

public class ej51buclepiramidehueca {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int altura;
        char caracter;

        do{
            System.out.println("Ingrese la altura ");
            altura = sc.nextInt();
        }while(altura <= 0);

        System.out.println("Introduce un caracter : ");
        caracter = sc.next().charAt(0);

        for (int i = 1; i <= altura; i++) {
            //Espacios en blanco
            for(int j = 0; j < altura - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*i-1) ; k++){
                if(k == 0 || k == (2 * i -2) || i == altura ){
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
