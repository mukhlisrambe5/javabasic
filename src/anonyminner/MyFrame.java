package anonyminner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    MyFrame(){

        button1.setBounds(100,100,100,100);
        button2.setBounds(200,100,100,100);
        button3.setBounds(300,100,100,100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("You clickec button 1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clickec button 2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clickec button 3");
            }
        });
//        button1.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               System.out.println("You clicked button 1");
//            }
//        });
//        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button 1 clicked"));
//        button2.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button 2 clicked"));
//        button3.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button 3 clicked"));

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
