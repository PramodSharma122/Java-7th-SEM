// WAP to calculate Profit or Loss using GUI
// Date: 2025-05-26

import java.awt.event.*;
import javax.swing.*;

public class ProfitLoss {
    ProfitLoss() {
        JFrame jframe = new JFrame("Profit or Loss Calculator");

        JLabel lblCostPrice = new JLabel("Cost Price (CP):");
        lblCostPrice.setBounds(20, 30, 150, 20);
        jframe.add(lblCostPrice);

        JTextField txtCostPrice = new JTextField();
        txtCostPrice.setBounds(150, 30, 150, 20);
        jframe.add(txtCostPrice);

        JLabel lblSellingPrice = new JLabel("Selling Price (SP):");
        lblSellingPrice.setBounds(20, 55, 150, 20);
        jframe.add(lblSellingPrice);

        JTextField txtSellingPrice = new JTextField();
        txtSellingPrice.setBounds(150, 55, 150, 20);
        jframe.add(txtSellingPrice);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(20, 80, 150, 20);
        jframe.add(lblResult);

        JTextField txtResult = new JTextField();
        txtResult.setBounds(150, 80, 200, 20);
        txtResult.setEditable(false);
        jframe.add(txtResult);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(50, 110, 100, 25);
        jframe.add(btnCalculate);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(180, 110, 100, 25);
        jframe.add(btnClear);

        jframe.setLayout(null);
        jframe.setSize(400, 200);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double cp = Double.parseDouble(txtCostPrice.getText());
                    double sp = Double.parseDouble(txtSellingPrice.getText());

                    if (sp > cp) {
                        double profit = sp - cp;
                        txtResult.setText("Profit of Rs. " + profit);
                    } else if (cp > sp) {
                        double loss = cp - sp;
                        txtResult.setText("Loss of Rs. " + loss);
                    } else {
                        txtResult.setText("No Profit No Loss");
                    }
                } catch (NumberFormatException e) {
                    txtResult.setText("Enter valid numbers!");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtCostPrice.setText("");
                txtSellingPrice.setText("");
                txtResult.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new ProfitLoss();
    }
}
