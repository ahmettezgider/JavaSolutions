package JavaSwing.JavatPoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _36JColorChooser extends JFrame implements ActionListener {

    JButton b;
    Container c;

    _36JColorChooser(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this,"Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        _36JColorChooser ch = new _36JColorChooser();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
