import java.util.Scanner;

public class ejbucle1 {
    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int max = 0;
        int min = 200;

        


        //bucle pedir edad mientras usuario no ingrese -1
        do {

            //Solicitud de edad
            System.out.println("Ingrese la edad del primer alumno o Ingrese   -1  para salir: ");
            edad = sc.nextInt();

            //Calculo edad máxima
            if (edad > max) {
                max = edad;
            }else if (edad < min && edad >-1) {
                min = edad;
            }

        }while (edad != -1); //Cierre de while
        System.out.println("La edad maxima de los alumnos es : " + max);
        System.out.println("La edad minima de los alumnos es : " + min);


    }
}
