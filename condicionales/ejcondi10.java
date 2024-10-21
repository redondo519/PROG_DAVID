import java.util.Scanner;

public class ejcondi10 {
    public static void main(String[] args) {

        //Declaración de variables
        int dia, mes, año;
        boolean ok = false;

        //Solicitamos datos y los almacenamos
        System.out.printf("Introduce la fecha: \n" ) ;
        System.out.println("dia (1-31)");
        System.out.println("mes (1-12)");
        System.out.println("año (1-2024)");

        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        mes = sc.nextInt();
        año = sc.nextInt();


        //System.out.print("dia: " + dia + " mes: " + mes + " año: " + año);

        //Comprobación de fecha
        //Comprobacion de año, Si es CORRECTO >> Comprobacion dias para meses


        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if ((dia > 0 && dia <= 31) && (año>0 && año<2025)) {
                    ok = true;
                }
            }
            case 4, 6, 9, 11 -> {
                if ((dia > 0 && dia <= 30) && (año>0 && año<2025)){
                    ok = true;
                }
            }
            case 2 -> {
                if ((dia > 0 && dia <= 28) && (año>0 && año<2025)){
                    ok = true;
                }
            }
        }//FIN switch mes

        //Mostramos resultado
        if (ok){
            System.out.println("La fecha introducida es correcta");
        }else{
            System.out.println("La fecha introducida es incorrecta");
        }

    }
}