package pr11;

import javax.swing.*;
import java.awt.*;

public class Text {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Text");


        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 100, 400, 200);


        String[] colours = {"Чёрный", "Красный", "Зелёный", "Синий"};
        JComboBox colour = new JComboBox(colours);
        colour.setBounds(0, 0, 150, 20);


        String[] styles = {"Serif", "Arial", "Georgia", "Verdana"};
        JComboBox style = new JComboBox(styles);
        style.setBounds(0, 30, 150, 20);


        JButton okButton = new JButton("Применить");
        okButton.setBounds(200, 20, 101, 20);
        okButton.addActionListener(e -> click(colour, style, textArea));


        frame.add(okButton);
        frame.add(style);
        frame.add(textArea);
        frame.add(colour);
        frame.setLocation(500,100);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static void click(JComboBox colour, JComboBox style, JTextArea area) {
        int a = colour.getSelectedIndex();
        int b = style.getSelectedIndex();
        switch (a) {
            case (0) -> area.setForeground(Color.black);
            case (1) -> area.setForeground(Color.red);
            case (2) -> area.setForeground(Color.green);
            case (3) -> area.setForeground(Color.blue);
        }
        switch (b) {
            case (0) -> area.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
            case (1) -> area.setFont(new Font("Arial", Font.BOLD, 20));
            case (2) -> area.setFont(new Font("Georgia", Font.ITALIC, 25));
            case (3) -> area.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 28));
        }
    }
}
