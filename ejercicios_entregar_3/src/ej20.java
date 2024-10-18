import javax.swing.*;

public class ej20 {
    public static void main(String[] args) {
        final double descuento = 0.2;
        double precioArticulo;
        double precioFinal;
        double descuentoArticulo;
        JOptionPane.showMessageDialog(null, "CALCULO DE DESCUENTO");
        precioArticulo= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce precio de articulo"));
        descuentoArticulo = precioArticulo * descuento;
        precioFinal= precioArticulo - descuentoArticulo;
        JOptionPane.showMessageDialog(null, "Descuento aplicado: " + descuentoArticulo);
        JOptionPane.showMessageDialog(null, "Precio final: " + precioFinal);
    }
}
