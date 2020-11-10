package JavaSwing.JavatPoint;

import javax.swing.*;

public class _32JSeparator {

    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4;

    _32JSeparator()  {
        JFrame f = new JFrame("Separator Example");
        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        menu.addSeparator();

        submenu = new JMenu("Sub Menu");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        submenu.add(i3);
        submenu.addSeparator();
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new _32JSeparator();
    }
}
