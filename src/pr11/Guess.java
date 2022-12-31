package pr11;

import javax.swing.*;
import java.util.Objects;

public class Guess {
    static void click(JTextArea enter, int rnd, Attempt attempt, JLabel output, JLabel counter, JButton submit) {

        attempt.up();
        counter.setText("attempts counter " + attempt.getAttempt() + "/3");
        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) == rnd) {
            output.setText("you're right!");
            submit.setVisible(false);
            return;
        }
        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) > rnd) {
            output.setText("no, the number is less");
        }

        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) < rnd) {
            output.setText("no, the number is greater");
        }
        if (attempt.getAttempt() == 3 && Integer.parseInt(enter.getText()) != rnd) {
            output.setBounds(20, 160, 2000, 30);
            output.setText("no, you're out of attempts for now.\n the number is: " + rnd);
            submit.setVisible(false);
        }
        enter.setText(null);
    }

    public static void main(String[] args) {
        Attempt attempt = new Attempt(0);
        int rnd = (int) (Math.random() * 20);
        //System.out.println(rnd);


        JFrame frame = new JFrame("Guess");


        JLabel greeting = new JLabel("you need to guess the number from 0 to 20");
        greeting.setBounds(5, 0, 2000, 15);
        JTextArea enter = new JTextArea();
        enter.setBounds(60, 100, 150, 30);

        JLabel counter = new JLabel("attempt counter " + attempt.getAttempt() + "/3");
        counter.setBounds(5, 25, 200, 15);
        JLabel output = new JLabel("no attempts made so far");
        output.setBounds(55, 160, 2000, 30);


        JButton submit = new JButton("GUESS");
        submit.setBounds(70, 140, 130, 20);
        submit.addActionListener(e -> click(enter, rnd, attempt, output, counter, submit));


        frame.add(enter);
        frame.add(greeting);
        frame.add(counter);
        frame.add(submit);
        frame.add(output);
        frame.setSize(600, 300);
        frame.setLocation(500,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
