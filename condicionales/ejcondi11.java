import java.util.Scanner;

public class ejcondi11 {


    //HACER ESTE EJERCICIO, CAMBIANDO COSAS
    //HACER EJ 6,12,13,14


    public static void main(String[] args) {

        //Declaración de variables
        int dia, mes, año;
        boolean ok = false;

        //Solicitamos datos y los almacenamos
        System.out.printf("Introduce la fecha: \n");
        System.out.println("dia (1-31)");
        System.out.println("mes (1-12)");
        System.out.println("año (1-2024)");

        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        mes = sc.nextInt();
        año = sc.nextInt();


        //Comprobación de fecha
        //Comprobacion de año, Si es CORRECTO >> Comprobacion dias para meses


        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if ((dia > 0 && dia <= 31) && (año > 0 && año < 2025)) {
                    ok = true;
                }
            }
            case 4, 6, 9, 11 -> {
                if ((dia > 0 && dia <= 30) && (año > 0 && año < 2025)) {
                    ok = true;
                }
            }
            case 2 -> {
                if ((dia > 0 && dia <= 28) && (año > 0 && año < 2025)) {
                    ok = true;
                }
            }
        }//FIN switch mes


        // Mostramos resultado
        if (ok) {
            System.out.println("La fecha introducida es correcta");

            // Calculamos la fecha siguiente
            int diaSiguiente = dia + 1;
            int mesSiguiente = mes;
            int añoSiguiente = año;

            // Comprobamos si el día siguiente es válido
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (diaSiguiente > 31) {
                    diaSiguiente = 1;
                    mesSiguiente++;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (diaSiguiente > 30) {
                    diaSiguiente = 1;
                    mesSiguiente++;
                }
            } else if (mes == 2) {
                if (diaSiguiente > 28) {
                    diaSiguiente = 1;
                    mesSiguiente++;
                }
            }

            // Comprobamos si el mes siguiente es válido
            if (mesSiguiente > 12) {
                mesSiguiente = 1;
                añoSiguiente++;
            }


            System.out.printf("La fecha introducida más un dia es: %d %d %d", diaSiguiente,mesSiguiente,añoSiguiente);
        }
    }
}


