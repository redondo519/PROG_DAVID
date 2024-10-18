import javax.swing.*;

public class ej32 {
    public static void main(String[] args) {

        boolean lluvia = false;
        boolean tarea = false;
        boolean biblioteca = false;
        boolean salir;

        JOptionPane.showMessageDialog(null, "Salir a la calle ... Introduce true/false ");
        lluvia = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Va a llover hoy ?"));
        tarea = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Has realizado la tarea ?"));
        biblioteca = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿ Tienes que ir hoy a la biblioteca ?"));

        //System.out.println("Biblioteca: " + biblioteca);
        //System.out.println("Lluvia: " + lluvia);
        //System.out.println("Tarea: " + tarea);


        salir = biblioteca || (!lluvia && tarea);
        System.out.println(salir);
        JOptionPane.showMessageDialog(null, "Puedes salir: " + salir);

    }
}