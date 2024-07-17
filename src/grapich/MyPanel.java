package grapich;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // g2d.setPaint(Color.blue);
        // g2d.setStroke(new BasicStroke(5));
        // g2d.drawLine(0, 0, 500, 500);
        // g2d.setPaint(Color.pink);
        // g2d.drawRect(0,0,100,200);
        // g2d.fillRect(0,0,100,200);

        g2d.setPaint(Color.orange);
        g2d.drawOval(0, 0, 100, 100);
        g2d.fillOval(0, 0, 100, 100);
    }
}
