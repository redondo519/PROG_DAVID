import java.util.Scanner;

public class ejcondi12 {
    public static void main(String[] args) {

        //variables declaradas
        String horoscopo;
        int dia;
        int mes;
        boolean ok = false;

        Scanner scanner = new Scanner(System.in);

        // Solicitar el día de nacimiento
        System.out.print("introduce tu dia de nacimiento (dd): ");
        dia = scanner.nextInt();

        // Solicitar el mes de nacimiento
        System.out.print("Introduce tu mes de nacimiento (mm): ");
        mes = scanner.nextInt();


        //Comprobacion de fecha introducida
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia > 0 && dia <= 31) {
                    ok = true;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia > 0 && dia <= 30) {
                    ok = true;
                }
            }
            case 2 -> {
                if (dia > 0 && dia <= 28) {
                    ok = true;
                }
            }
        }//FIN switch mes

        if (ok){
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                horoscopo = "Acuario";
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                horoscopo = "Piscis";
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                horoscopo = "Aries";
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                horoscopo = "Tauro";
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                horoscopo = "Géminis";
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                horoscopo = "Cáncer";
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                horoscopo = "Leo";
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                horoscopo = "Virgo";
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                horoscopo = "Libra";
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                horoscopo = "Escorpio";
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                horoscopo = "Sagitario";
            } else {
                horoscopo = "Capricornio";
            }

            System.out.print("Tu horóscopo es: " + horoscopo);
        }else{
            System.out.println("Fecha mal introducida (ejemplo fecha:  dia: 1    mes: 1)     ");
        }

    }
}