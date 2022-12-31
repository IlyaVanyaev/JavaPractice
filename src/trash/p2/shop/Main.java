package trash.p2.shop;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        Shop x = new Shop();
        System.out.print(
                """
                        Welcome to the shop!
                        ---------------------------------------
                        press 1 to set the amount of computers
                        press 2 to add the computer
                        press 3 to delete the computer
                        press 4 to show all the computers
                        press 5 to show the amount of computers
                        press 6 to search the computer
                        press 0 to exit
                        ---------------------------------------
                        """
        );
        while (true) {
            System.out.print("What you want to do: ");
            n = input.nextInt();
            if (n == 1) x.setShop();
            else if (n == 2) x.addComp();
            else if (n == 3) x.deleteComp();
            else if (n == 4) x.showAll();
            else if (n == 5) x.showI();
            else if (n == 6) x.searchComp();
            else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
