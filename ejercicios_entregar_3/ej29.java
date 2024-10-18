import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int horas, minutos, segundos, resto;
        System.out.print("Ingrese la hora: ");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();

        System.out.print("Ingrese la minutos: ");
        minutos = sc.nextInt();

        System.out.print("Ingrese la segundos: ");
        segundos = sc.nextInt();

        horas = horas * 3600;
        minutos = minutos * 60;
        segundos = segundos + minutos + horas + 1;

        horas = (segundos / 3600);
        resto = segundos % 3600;
        minutos = (resto / 60);
        resto = resto % 60;

        System.out.printf("Transcurrido un segundo la hora será la siguiente: %02d : %02d : %02d ", horas, minutos, resto);
    }
}
