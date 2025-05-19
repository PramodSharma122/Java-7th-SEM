//WAP to create a jComboBox in Java
// Date: 2025-05-19

import javax.swing.*;
public class JComboBoxExample {
    JFrame f;
    JComboBoxExample() {
        f = new JFrame("ComboBox Example");
        String p[]={"CSIT","BBA","BBS","BCA"};
        JComboBox cb=new JComboBox(p);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new JComboBoxExample();
    }
}
