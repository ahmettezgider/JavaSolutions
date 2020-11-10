package JavaSwing.JavatPoint;

import javax.swing.*;

public class _12JCheckBox {

    _12JCheckBox(){
        JFrame f= new JFrame("CheckBox Example");

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100,100, 100,50);

        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100,150, 100,50);

        f.add(checkBox1);
        f.add(checkBox2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new _12JCheckBox();
    }
}
