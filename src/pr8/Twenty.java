package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Twenty extends JFrame {

    Twenty(){
        JFrame frame = new JFrame("Twenty");


        frame.setSize(700,450);
        frame.setLocation(400,100);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton btn = new JButton("DRAW");
        btn.setBounds(300,350, 100,50);

        ActionListener l= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        btn.addActionListener(l);
        frame.add(btn);

    }

    public void shape(Shape x, Graphics g){
        if (x instanceof Rectangle){
            g = (Graphics2D) g;
            g.setColor(Color.getColor(x.getColor()));
            g.fillRect(x.getX(),x.getY(),x.getW(),x.getH());
        }
    }



    public static void main(String[] args){
        Twenty x = new Twenty();
    }
}
