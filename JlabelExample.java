//WAP to create a JLabel in Java
// Date: 2025-05-19

import javax.swing.*;

class JlabelExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("JLabel Example");
        JLabel l1, l2;
        l1 = new JLabel("First Label");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Second Label");
        l2.setBounds(50, 100, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
