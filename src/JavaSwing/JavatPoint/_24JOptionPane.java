package JavaSwing.JavatPoint;

import javax.swing.*;

public class _24JOptionPane {

    JFrame f;
    _24JOptionPane(){
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) {
        new _24JOptionPane();
    }

}
