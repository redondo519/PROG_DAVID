import java.util.Scanner;

public class ejcondi7 {
    public static void main(String[] args) {
        //Delaración de variable entera para recoger numero
        int num;

        //Solicitamos valor para num(int)
        System.out.println("Introduce un numero entre 0 y 99999; contaremos sus cifras");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //Condicion para especificar rango
        if (num >= 0 && num <= 99999) {

            //Comprobamos si dentro del rango el numero es menor de 2 cifras, y lo mostramos
            if (num < 10){
                System.out.println("El numero tiene una cifra");

                //Comprobamos si dentro del rango el numero es menor de 3 cifras, y lo mostramos
            }else if (num < 100){
                System.out.println("El numero tiene dos cifra");

                //menor de 4 cifras
            }else if (num < 1000){
                System.out.println("El numero tiene tres cifras");

                //menor de 5 cifras
            }else if (num < 10000){
                System.out.println("El numero tiene cuatro cifras");

                //menor de 6 cifras
            }else if (num < 100000 ){
                System.out.println("El numero tiene cinco cifras");
            }

            //Mostramos que el numero no se encuentra dentro del rango {NO entra en CONDICION}
        }else{
            System.out.println("El numero no está en el rango especificado");
        }





    }
}