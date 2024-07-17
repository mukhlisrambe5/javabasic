import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Hello, World!");
        this.setVisible(true);
        this.setSize(300, 300);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("logo.jpeg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123, 123, 123));
    }
}
