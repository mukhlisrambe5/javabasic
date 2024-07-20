package lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("My Button");

    MyFrame(){

        myButton.setBounds(100,100,100,100);
        myButton.addActionListener(
            (e)->    System.out.println("Button Clicked!")
        );
        this.add(myButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(myButton);


    }
}
