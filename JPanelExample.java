// WAP to create a JPanel in Java
// Date: 2025-05-19

import java.awt.*;
import javax.swing.*;

class JPanelExample extends JFrame {
    static JFrame f;
    static JButton b, b1, b2;

    public static void main(String[] args) {
        f = new JFrame("JPanel Example");
        b = new JButton("Button 1");
        b1 = new JButton("Button 2");
        b2 = new JButton("Button 3");
        JPanel p = new JPanel();
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.setBounds(100, 100, 400, 400);
        p.setBackground(Color.yellow);
        f.add(p);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
