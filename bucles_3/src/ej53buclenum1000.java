import java.util.Scanner;

public class ej53buclenum1000 {
    public static void main(String[] args) {

        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num ;
        double suma = 0;
        double media = 0;
        double i = 0; //contador

        //bucle hasta num alcanzar 10000
        do{
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if (num > 0){
                suma = suma + num; //Suma total
                i++; //contador
                media = suma/i;
            }
        }while(suma <=10000);

        //Mostramos resultados
        System.out.println("TOTAL ACUMULADO: " + suma);
        System.out.printf("La media de los numeros es %.2f%n: ",media); //Mostramos resultado con 2 decimales
        System.out.printf("Total de numeros validos introducidos:  %.0f%n",i); //Mostramos resultado sin decimales

    }
}
