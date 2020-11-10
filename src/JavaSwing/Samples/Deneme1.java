package JavaSwing.Samples;

import javax.swing.*;

public class Deneme1 {
    public static void main(String[] args) {
        new MyFrame("Ilk Form");
    }

}

class MyFrame{
    JMenu jMenuFile, jMenuEdit;
    JMenuItem openItem, copyItem, pasteItem;


    public MyFrame(String baslik){

        JFrame frame = new JFrame(baslik);

        JMenuBar jMenuBar = new JMenuBar();

        jMenuFile = new JMenu("File");
        openItem = new JMenuItem("Open");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        jMenuFile.add(openItem);
        jMenuFile.add(copyItem);
        jMenuFile.add(pasteItem);

        jMenuBar.add(jMenuFile);

        frame.setJMenuBar(jMenuBar);

        frame.setBounds(100, 100, 200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
