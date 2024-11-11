public class ejarrays1 {
    public static void main(String[] args) {
        int numero[] = new int [10];

        for (int i = 0; i < numero.length; i++) {

            numero[i] = (int) (Math.random()*100);

        }

        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " : ");
        }

    }
}