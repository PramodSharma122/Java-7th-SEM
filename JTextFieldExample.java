// WAP to create a JPanel in Java
// Date: 2025-05-19
// WAP to create a JTextField in Java

import javax.swing.*;

public class JTextFieldExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("TextField Example");
        JTextField t1, t2;
        t1 = new JTextField();
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Bharatpur");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
