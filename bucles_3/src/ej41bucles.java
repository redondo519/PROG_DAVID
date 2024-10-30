public class ej41bucles {
    public static void main(String[] args) {
        //BUCLE FOR

        //Declaracion de variables
        int i;

        //bucle desde el primer multiplo de 5 (5) hasta 100
        for (i = 5; i <= 100; i++) {
            //Muestra mediante condicion solo los numeros multiplos de 5
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
