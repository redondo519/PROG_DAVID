import java.util.Scanner;

public class ejbucle3 {
    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        int n,total;
        int suma=0;
        int mayores = 0;

        //agregar bucle
        System.out.println("Ingrese la edad del alumno:");
        n = sc.nextInt();
        suma = suma + n;
        System.out.println("La suma de los alumnos es: "+suma);
        System.out.println("La edad media de los alumnos es: "+suma/n);

        if (n!=0) {
            if (n > 18) {
                mayores++;
            }
        }else{
            System.out.println("ERROR");
        }

    }
}
