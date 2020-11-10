package JavaSwing.JavatPoint;

import javax.swing.*;

public class _08JTextArea {
    _08JTextArea(){
        JFrame f = new JFrame();

        JTextArea area=new JTextArea("Welcome to javatpoint");
        area.setBounds(10,30, 200,200);

        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new _08JTextArea();
    }
}
