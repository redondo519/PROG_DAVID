import javax.swing.*;

public class ejcondi9 {
    public static void main(String[] args) {

        //Declara variable para numero 1-7
        int num;

        //Solicitud de numero, se almacena en num(int)
        JOptionPane.showMessageDialog(null, "DIAS DE LA SEMANA");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero correspondiente a la semana (1-7)"));

        //System.out.println(num);

        //Condicion para un valor num = DIA
        switch (num) {
            case 1:
                JOptionPane.showMessageDialog(null, "LUNES");
                break; // Pausa para salir del switch
            case 2:
                JOptionPane.showMessageDialog(null, "MARTES");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MIERCOLES");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "JUEVES");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "VIERNES");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "SABADO");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "DOMINGO");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El numero especificado no pertenece a un dia de la semana");
        }


    }

}