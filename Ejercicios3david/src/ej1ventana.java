
import javax.swing.*;

public class ej1ventana {
    public static void main(String[] args) {
        int n ;
        System.out.println("Hello World");

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")); // n(int) cambiamos el valor de string a Int
        JOptionPane.showMessageDialog(null, "EDAD  " + n);
    }
}
