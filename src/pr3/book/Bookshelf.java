package pr3.book;

import java.util.Scanner;

public class Bookshelf {
    private Book[] shelf;
    private int amount;
    Scanner input = new Scanner(System.in);
    Scanner str = new Scanner(System.in);
    public void setShelf() {
        System.out.print("what size of the shelf? - ");
        amount = input.nextInt();
        shelf = new Book[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("book " + (i + 1) + ":");
            System.out.print("type the title of the book: ");
            String title = str.nextLine();
            System.out.print("type the author of the book: ");
            String author = str.nextLine();
            System.out.print("type the year of the book: ");
            int year = input.nextInt();
            shelf[i] = new Book(author, title, year);
            System.out.println("done");
        }
    }

    public void getShelf(){
        for (int i = 0; i < amount; i++) System.out.println(shelf[i]);
    }

    public Book getEarly(){
        Book early = new Book();
        early.setYear(3000);
        for (int i = 0; i < amount; i++){
            if (shelf[i].getYear() < early.getYear()) early = shelf[i];
        }
        System.out.print("the earliest book from the shelf is ");
        return early;

    }

    public Book getLate(){
        Book late = new Book();
        late.setYear(1);
        for (int i = 0; i < amount; i++){
            if (shelf[i].getYear() > late.getYear()) late = shelf[i];
        }
        System.out.print("the latest book from the shelf is ");
        return late;

    }

    public void sortShelf(){
        Book temp = new Book();
        boolean iter = true;
        while (iter) {
            iter = false;
            for (int i = 1; i < amount; i++) {
                if (shelf[i].getYear() < shelf[i - 1].getYear()) {
                    temp = shelf[i];
                    shelf[i] = shelf[i-1];
                    shelf[i-1] = temp;
                    iter = true;
                }
            }
        }
        System.out.println("the shelf is sorted by year");
    }
}
