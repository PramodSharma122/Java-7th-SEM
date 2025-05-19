//WAP to create a jRadioButton in Java
// Date: 2025-05-19

import javax.swing.*;
public class jRadioButtonExample {
    JFrame f;
    jRadioButtonExample() {
        f = new JFrame("Radio Button Example");
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new jRadioButtonExample();
    }
}
