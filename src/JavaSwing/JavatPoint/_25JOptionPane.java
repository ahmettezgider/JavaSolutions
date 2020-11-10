package JavaSwing.JavatPoint;

import javax.swing.*;

public class _25JOptionPane {

    JFrame f;
    _25JOptionPane(){
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f,"Enter Name");
    }

    public static void main(String[] args) {
        new _25JOptionPane();
    }
}
