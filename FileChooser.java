// WAP to create file chooser
// Date: 2025-05-26

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class FileChooser extends JFileChooser {
    FileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }

    public static void main(String s[]) {
        FileChooser obj = new FileChooser();
    }

}