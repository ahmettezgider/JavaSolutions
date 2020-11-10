package JavaSwing.JavatPoint;

import javax.swing.*;

public class _21JList {
    _21JList(){
        JFrame f= new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");

        JList<String> list = new JList<>(l1);
        list.setBounds(100,100, 75,75);

        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new _21JList();
    }
}
