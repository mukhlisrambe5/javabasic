
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("logo.jpeg");
        JLabel label = new JLabel();
        label.setText("Hello, Worlddgdfd!");
        label.setIcon(icon);
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

    }
}
