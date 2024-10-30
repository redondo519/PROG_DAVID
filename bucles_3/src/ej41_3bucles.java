public class ej41_3bucles {
    public static void main(String[] args) {
        //BUCLE DO

        //Declaracion de variable para contador
        int i = 5;

        //Bucle do para hayar todos los numeros entre 5 y 100
        do{
        //Condicion para ser multiplo de 5
            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;

        }while(i<=100) ;
        //correcion
    }
}
