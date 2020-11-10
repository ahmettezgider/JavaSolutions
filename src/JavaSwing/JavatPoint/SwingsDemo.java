package JavaSwing.JavatPoint;


import java.awt.*;
import javax.swing.*;

public class SwingsDemo extends JFrame
{
    public SwingsDemo()
    {
        String path = "//home//user//Documents//images";
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        Box myHorizontalBox = Box.createHorizontalBox();
        Box myVerticleBox = Box.createVerticalBox();

        myHorizontalBox.add(new JButton("My Button 1"));
        myHorizontalBox.add(new JButton("My Button 2"));
        myHorizontalBox.add(new JButton("My Button 3"));

        myVerticleBox.add(new JButton(new ImageIcon(path + "//Image1.jpg")));
        myVerticleBox.add(new JButton(new ImageIcon(path + "//Image2.jpg")));
        myVerticleBox.add(new JButton(new ImageIcon(path + "//Image3.jpg")));

        contentPane.add(myHorizontalBox);
        contentPane.add(myVerticleBox);

        pack();

        setVisible(true);
    }

    public static void main(String args[]) {
        new SwingsDemo();
    }
}

