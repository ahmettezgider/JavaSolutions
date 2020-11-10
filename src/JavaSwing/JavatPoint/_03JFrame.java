package JavaSwing.JavatPoint;

import javax.swing.*;

public class _03JFrame {
    _03JFrame(){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("login.png"));
        b.setBounds(100,100,100, 100);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new _03JFrame();
    }
}