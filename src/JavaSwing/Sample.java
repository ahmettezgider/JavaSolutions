package JavaSwing;

import javax.swing.*;


public class Sample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Yeni Pencere");
        frame.setBounds(200, 100, 400, 400);

        JLabel label1 = new JLabel();
        label1.setBounds(100, 50, 100, 30);

        JButton button1 = new JButton("Buton-1");
        button1.setBounds(100, 100, 100, 30);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemClose = new JMenuItem("Close");
        menuFile.add(menuItemOpen);
        menuFile.add(menuItemClose);

        JMenu menuEdit = new JMenu("File");
        JMenuItem menuItemCopy = new JMenuItem("Copy");
        JMenuItem menuItemPaste = new JMenuItem("Paste");
        menuEdit.add(menuItemCopy);
        menuEdit.add(menuItemPaste);

        jMenuBar.add(menuFile);
        jMenuBar.add(menuEdit);


        jMenuBar.setVisible(true);
        frame.setJMenuBar(jMenuBar);
        frame.add(label1);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

