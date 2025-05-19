//WAP to create a frame using inheritance in Java
// Date: 2025-05-19

import javax.swing.*;
public class FrameByinheritance extends JFrame{
   JFrame f;
   FrameByinheritance(){
    setSize(700, 500);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args){
    new FrameByinheritance();
   }
}
