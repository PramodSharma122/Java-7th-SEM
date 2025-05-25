// WAP to example of ActionEvent in Java Swing
// Date: 2025-05-22

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventExample extends JFrame implements ActionListener{
    private int count=0;
    JLabel lblData;
    EventExample(){
        setLayout(new FlowLayout());{
            lblData=new JLabel("Button clicked 0 times");
            JButton btnClicks = new JButton("Click Me");
            btnClicks.addActionListener(this);
            add(btnClicks);
            add(lblData);
        }
    }
    public void actionPerformed(ActionEvent e){
        count++;
        lblData.setText("Button clicked " + count + " times");
    }
}
public class ActionEventExample{
    public static void main(String[] args){
        EventExample frame = new EventExample();
        frame.setTitle("Event Example");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
