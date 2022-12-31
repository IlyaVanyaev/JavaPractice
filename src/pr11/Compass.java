package pr11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Compass {
    public static class Test extends JFrame {
        boolean flag = true;
        Test(String s) {
            super(s);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setSize(500, 500);
            setLocation(500,100);

            Container container = getContentPane();
            JLabel often = new JLabel("NORTH");
            often.setHorizontalAlignment(JLabel.CENTER);
            often.setBorder(BorderFactory.createLineBorder(Color.BLUE));

            often.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(often, "Добро пожаловать в Cold Little Chapel");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel west = new JLabel("WEST");
            west.setHorizontalAlignment(JLabel.CENTER);
            west.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            west.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(west, "Добро пожаловать в Los Alamos");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel centr = new JLabel("CENTER");
            centr.setHorizontalAlignment(JLabel.CENTER);
            centr.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            centr.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(centr, "Добро пожаловать в Earth Kernel");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel east = new JLabel("EAST");
            east.setHorizontalAlignment(JLabel.CENTER);
            east.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            east.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(east, "Добро пожаловать в Byron Bay");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel south = new JLabel("SOUTH");
            south.setHorizontalAlignment(JLabel.CENTER);
            south.setBorder(BorderFactory.createLineBorder(Color.RED));
            south.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {


                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(south, "Добро пожаловать в Tuapse");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            container.add(often, BorderLayout.NORTH);
            container.add(centr, BorderLayout.CENTER);
            container.add(west, BorderLayout.WEST);
            container.add(east, BorderLayout.EAST);
            container.add(south, BorderLayout.SOUTH);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Compass.Test("Compass");
    }
}
