// WAP to create color chooser
// Date: 2025-05-26

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooser extends JFrame {
    private JLabel sampleText = new JLabel("DEMO OF COLOR");
    private JButton chooseButton = new JButton("Choose Color");

    public ColorChooser() {
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        sampleText.setBackground(null);
        panel1.add(sampleText);

        chooseButton.addActionListener(new ButtonListener());
        panel1.add(chooseButton);

        add(panel1);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Color c = JColorChooser.showDialog(null, "Choose a Color", sampleText.getForeground());
            if (c != null)
                sampleText.setForeground(c);
        }
    }

    public static void main(String[] args) {
        new ColorChooser();
    }

}