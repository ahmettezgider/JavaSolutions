package JavaSwing.JavatPoint;

import javax.swing.*;

public class _23JOptionPane {

    JFrame f;

    _23JOptionPane(){
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
    }

    public static void main(String[] args) {
        new _23JOptionPane();
    }
}
