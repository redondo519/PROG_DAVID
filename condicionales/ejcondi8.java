import java.util.Scanner;

public class ejcondi8 {
    public static void main(String[] args) {

    //SWITCH CASE
        //Delaración de variable entera para recoger nota
        int nota;

        //Solicitamos valor para nota(int)
        System.out.print("Introduce tu nota: ");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();

        //Condicion para especificar rango
        if (nota >= 0 && nota <= 10) {

            //Comprobamos si dentro del rango el numero es menor o igual que 4 para = INSUFICIENTE
            if (nota <= 4){
                System.out.println("INSUFICIENTE : " + nota);

                //Comprobamos si dentro del rango el numero es 5
            }else if (nota == 5){
                System.out.println("SUFICIENTE : " + nota);

                //nota es 6
            }else if (nota == 6){
                System.out.println("BIEN : " + nota);

                //nota es 7 o 8
            }else if (nota == 7 || nota == 8){
                System.out.println("NOTABLE : " + nota);

                //nota es 9 o 10
            }else{
                System.out.println("SOBRESALIENTE : " + nota);
            }

            //Mostramos que el numero no se encuentra dentro del rango {NO entra en CONDICION}
        }else{
            System.out.println("La nota insertada no es correcta, porfavor, Introduzca una nota entre 0 y 10");
        }





    }
}
