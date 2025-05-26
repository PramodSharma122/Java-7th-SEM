// WAP using GUI to find the greatest of three numbers
// Date: 2025-05-25

import java.awt.event.*;
import javax.swing.*;

public class Greatestnum {
    Greatestnum() {
        JFrame jframe = new JFrame("Greatest of Three Numbers");

        JLabel lblFirst = new JLabel("First Number:");
        lblFirst.setBounds(20, 30, 120, 20);
        jframe.add(lblFirst);

        JTextField txtFirst = new JTextField();
        txtFirst.setBounds(150, 30, 150, 20);
        jframe.add(txtFirst);

        JLabel lblSecond = new JLabel("Second Number:");
        lblSecond.setBounds(20, 60, 120, 20);
        jframe.add(lblSecond);

        JTextField txtSecond = new JTextField();
        txtSecond.setBounds(150, 60, 150, 20);
        jframe.add(txtSecond);

        JLabel lblThird = new JLabel("Third Number:");
        lblThird.setBounds(20, 90, 120, 20);
        jframe.add(lblThird);

        JTextField txtThird = new JTextField();
        txtThird.setBounds(150, 90, 150, 20);
        jframe.add(txtThird);

        JLabel lblGreatestnum = new JLabel("Greatest:");
        lblGreatestnum.setBounds(20, 120, 120, 20);
        jframe.add(lblGreatestnum);

        JTextField txtGreatestnum = new JTextField();
        txtGreatestnum.setBounds(150, 120, 150, 20);
        txtGreatestnum.setEditable(false);
        jframe.add(txtGreatestnum);

        JButton btnFind = new JButton("Find");
        btnFind.setBounds(50, 160, 80, 25);
        jframe.add(btnFind);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(170, 160, 80, 25);
        jframe.add(btnClear);

        jframe.setLayout(null);
        jframe.setSize(400, 250);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int a = Integer.parseInt(txtFirst.getText());
                    int b = Integer.parseInt(txtSecond.getText());
                    int c = Integer.parseInt(txtThird.getText());

                    int greatest = Math.max(a, Math.max(b, c));
                    txtGreatestnum.setText(" " + greatest);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(jframe, "Please enter valid integers.");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtFirst.setText("");
                txtSecond.setText("");
                txtThird.setText("");
                txtGreatestnum.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Greatestnum();
    }
}
