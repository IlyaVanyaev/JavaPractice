package trash.p2;

import java.util.Scanner;

public class Poker {
    private int n;
    private String[] deck;
    private String[] suit = {"clubs", "spades", "diamonds", "hearts"};
    private String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private int amount;
    private int hand = 5;

    Poker (int n){
        this.n = n;
        amount = suit.length * rank.length;
        deck = new String[amount];
        setDeck();
    }

    public void setDeck (){
        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++)
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
    }

    public void showDeck (){
        for (int i = 0; i < n * hand; i++) {
            System.out.println(deck[i]);
            if (i % hand == hand - 1) System.out.println();
        }
    }

    public void shuffleDeck (){
        for (int i = 0; i < amount; i++){
            int shuffle = (int) (Math.random() * (amount - 1));
            String temp = deck[shuffle];
            deck[shuffle] = deck[i];
            deck[i] = temp;
        }
    }



    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many players are in? - ");
        int players = input.nextInt();
        Poker x = new Poker(players);
        x.shuffleDeck();
        x.showDeck();
    }

}
