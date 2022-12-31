package trash.p2;

import java.util.Scanner;

public class HowMany {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] words = s.split(" ");
        System.out.println(words.length);
    }
}
