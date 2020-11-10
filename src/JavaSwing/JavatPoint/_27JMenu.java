package JavaSwing.JavatPoint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class _27JMenu {

    JMenu fileMenu, editMenu;
    JMenuItem menuNew, menuOpen, menuPrint, menuSetup, menuHelp;

    _27JMenu(){

        JFrame f = new JFrame("Menu and MenuItem Example");

        JMenuBar menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        menuNew = new JMenuItem("New");
        menuOpen = new JMenuItem("Open");

        fileMenu.add(menuNew);
        fileMenu.add(menuOpen);


        editMenu = new JMenu("Edit");
        menuPrint = new JMenuItem("Print");
        menuSetup = new JMenuItem("Setup");
        menuHelp = new JMenuItem("Help");

        editMenu.add(menuPrint);
        editMenu.add(menuSetup);
        editMenu.add(menuHelp);

        fileMenu.add(editMenu);
        menuBar.add(fileMenu);

        JLabel label = new JLabel();
        label.setBounds(10,10, 200, 100);
        f.add(label);


        menuNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(e.getActionCommand());
            }
        });

        menuOpen.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Open");
            }
        });

        f.setJMenuBar(menuBar);

        f.setBounds(100, 100, 300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new _27JMenu();
    }
}
