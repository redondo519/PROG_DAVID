public class ej14bucles {
    public static void main(String[] args) {

        //Bucel para introducir con un titulo las tablas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); //Linea en blanco para separar cada tabla
        }
    }
}