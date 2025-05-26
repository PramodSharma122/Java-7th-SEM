// WAP to create a tabbed pane with two tabs
// Date: 2025-05-26

import javax.swing.*;
import java.awt.*;

public class UserTab extends JFrame {
    UserTab(String s) {
        super(s);
        JTabbedPane tabbedPane = new JTabbedPane();
        JLabel label1 = new JLabel("panel one");
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        tabbedPane.addTab("Tab One", null, panel1, "First Panel");
        JLabel label2 = new JLabel("panel two");
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.add(label2);
        tabbedPane.addTab("Tab Two", null, panel2, "Second Panel");
        add(tabbedPane);
    }

    public static void main(String s[]) {
        UserTab obj = new UserTab("tab demo");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(300, 400);
    }
}