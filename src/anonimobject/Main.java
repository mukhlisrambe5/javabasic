package anonimobject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame  frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

//        ImageIcon AC = new ImageIcon("src\\cards\\1.png");
//        JLabel AClabel = new JLabel(AC);
//        deck.add(AClabel);
//        frame.add(deck.get(0));
        for (int i =1; i<=8 ; i++){
            deck.add(new JLabel(new ImageIcon("src\\cards\\" +i+ ".png")));
            frame.add(deck.get(i-1));
        }


//        frame.add(deck.get(0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
