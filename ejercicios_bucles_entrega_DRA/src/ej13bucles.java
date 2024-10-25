import java.util.Scanner;

//Correspondiente con ejercicio 26
public class ej13bucles {
    public static void main(String[] args) {
        //declaracion e variables
        Scanner sc = new Scanner(System.in);
        int nota ;
        int suspensos = 0;
        int aprobados = 0;
        int i = 1;



        //Bucle para pedir 5 notas
        for (i=1;i<=6;i++) {
            //Solicitar 6 notas
            System.out.println("Introduce su nota");
            nota = sc.nextInt();
            if ((nota >=0) && (nota<=10)) {

                if (nota <= 4) {
                    suspensos++;
                }else{
                    aprobados++;
                }

            }else{
                i --; //restamos uno para que no cuente las notas fuera del rango
            }
        }
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
    }
}
