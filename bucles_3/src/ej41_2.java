public class ej41_2 {
    public static void main(String[] args) {
        //BUCLE WHILE

        //Declaracion de variable para contador
        int i = 5;

        //Bucle while para hayar todos los numeros entre 5 y 100
        while(i<=100) {

            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;

        }
    }
}
