import java.util.Scanner;

public class ej49buclesSumanum {
    public static void main(String[] args) {

        //Declarcion de variables
        Scanner sc = new Scanner(System.in);
        int num, i;
        int suma = 0;

        //Bucle comprobacion datos de entrada positivos
        do{
            //Solicitamos numero hasta que sea positivo
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();

        }while(num <0);

        //Bucle para sumar siguientes 100 numeros a num
        for (i=num+1;i<=num+101;i++){
            suma = suma + i;
        }
        System.out.printf("La suma de los 100 siguientes numeros a %d es : %d",num,suma);
    }
}
