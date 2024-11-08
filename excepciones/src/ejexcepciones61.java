import java.util.Scanner;

public class ejexcepciones61  {
    public static void main(String[] args) {
        //Declaracion variables
        Scanner entrada = new Scanner(System.in);
        String a;
        int num;

        //Solicitamos cadena de caracteres
        System.out.println("Introduce una cadena de caracteres");
        a = entrada.nextLine();

        //Comprobacion de excepcion
        try{
            num = Integer.parseInt(a);
            System.out.println(num);
        }catch(Exception e){
            System.out.println("Error: numero invalido");
        }

    }

}
