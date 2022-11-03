import javax.swing.*;

public class HolaMundo {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Introduce tu nombre");

        JOptionPane.showMessageDialog(null,"Tu nombre es " + nombre);

    }
}
