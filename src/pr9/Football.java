package pr9;

import javax.swing.*;

public class Football {
    public static void main(String[] args) {
        Team first = new Team("Milan");
        Team second = new Team("Madrid");

        //Окно
        JFrame frame = new JFrame("Match");


        //Счёт
        JLabel result = new JLabel("Result: " + first.getScore() + " : " + second.getScore());
        result.setBounds(5, 60, 100, 100);

        //Последняя забившая команда
        JLabel last = new JLabel("Last Scorer: N/A");
        last.setBounds(5, 80, 150, 100);

        //Победитель
        JLabel winner = new JLabel("Winner: DRAW");
        winner.setBounds(5, 100, 150, 100);

        //Кнопка первой команды
        JButton firstTeam = new JButton(first.getName());
        firstTeam.setBounds(5, 15, 85, 20);
        firstTeam.addActionListener(e -> click(1, first, second, result, last, winner));

        //Кнопка второй команды
        JButton secondTeam = new JButton(second.getName());
        secondTeam.setBounds(100, 15, 85, 20);
        secondTeam.addActionListener(e -> click(2, first, second, result, last, winner));


        //Добавление элеметов в окно
        frame.add(result);
        frame.add(firstTeam);
        frame.add(secondTeam);
        frame.add(last);
        frame.add(winner);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static void click(int a, Team first, Team second, JLabel box, JLabel last, JLabel winner) {
        if (a == 1) {
            first.click();
            last.setText("Last Scorer: " + first.getName());
        }
        if (a == 2) {
            second.click();
            last.setText("Last Scorer: " + second.getName());
        }
        box.setText("Result: " + first.getScore() + " : " + second.getScore());
        if (first.getScore() > second.getScore()) {
            winner.setText("Winner: " + first.getName());
        } else if (first.getScore() == second.getScore()) {
            winner.setText("Winner: DRAW");
        } else {
            winner.setText("Winner: " + second.getName());
        }
    }
}
