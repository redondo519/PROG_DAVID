import java.util.Scanner;

public class ej55bublesnumalreves {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num;
        int numReves = 0;

        //Solicitud de num
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        while(num != 0){
            int digito = num % 10;
            numReves = numReves * 10 +digito;
            num = num/10;
        }
        
        System.out.println(numReves);



    }
}
