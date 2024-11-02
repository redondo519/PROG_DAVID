import java.util.Scanner;

public class ej52buclesCalculos {
    public static void main(String[] args) {

        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num; //Numero para introducir
        int i = 0; //variable contador total numeros introducidos
        double j = 0; //variable contador numeros impares para media
        int mayor = 0; //almacena el num par mayor
        double suma = 0;
        double media = 0; //para calculo media de los impares

        //bucle pedir nums distintos hasta que num -> negativo
        do{
            //solicitamos numero
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();

            //aumentamos contador



            //Excluir a los negativos
            if (num >= 0){
                i++;

            }

            //Comprobamos paridad
            if (num % 2 == 0){ //pares

                if (num > mayor) {
                    mayor = num; //almacenamos mayor
                }

            }else{ //impares

                if (num >= 0) { //excluimos numeros negativos
                    j++;
                    suma = suma + num; //realizamos suma
                    media = suma/j; //almacenamos media
                }


            }

        }while(num >=0);

        System.out.printf("Se han introducido un total de %d numeros positivos: \n ",i);
        System.out.println("La media de los numeros impares es: " + media);
        System.out.println("El mayor introducido  de los numeros pares es: " + mayor);

    }
}
