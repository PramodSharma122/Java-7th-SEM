// WAP to create menu demo for pop 
// Date: 2025-05-26

import javax.swing.*;
import java.awt.event.*;

public class MenudemoPop extends JFrame {
   JPopupMenu popupmenu;

   MenudemoPop() {
      super("menu demo");
      JRadioButtonMenuItem[] items;
      String[] colors = { "Blue", "Yellow", "Red" };
      items = new JRadioButtonMenuItem[colors.length];
      popupmenu = new JPopupMenu();
      for (int count = 0; count < items.length; count++) {
         items[count] = new JRadioButtonMenuItem(colors[count]);
         popupmenu.add(items[count]);
      }
      addMouseListener(
            new MouseAdapter() {
               public void mousePressed(MouseEvent event) {
                  popupmenu.show(event.getComponent(), event.getX(), event.getY());
               }
            });
   }

   public static void main(String s[]) {
      MenudemoPop obj = new MenudemoPop();
      obj.setVisible(true);
      obj.setSize(300, 300);
   }

}