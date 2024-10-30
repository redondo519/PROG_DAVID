import java.util.Scanner;

public class ej45_bucle_CajaFuerte {
    public static void main(String[] args) {

        //Declaracion de CONSTANTE para combinacion caja fuerte
        final int p = 1234;
        //Declaracion variable para escaner
        Scanner sc = new Scanner(System.in);

        //Solicitud p (int) contraseña
        System.out.println("CAJA FUERTE\n");

        for (int i = 0; i <=3; i++) {
            System.out.print("Introduce la contraseña: ");
            int n = sc.nextInt();

            if(n==p){
                System.out.println("Contraseña correcta");
                i = 4;
            }else{
                System.out.println("CONTRASEÑA INCORRECTA");
            }

        }


    }
}
