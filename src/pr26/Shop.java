package pr26;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Shop {
    Scanner scanner = new Scanner(System.in);

    public String getProduct() {
        System.out.print("what is your order? - ");
        return scanner.nextLine();
    }

    public int getPrice() {
        System.out.print("type the prise: ");

        return Integer.parseInt(scanner.nextLine());
    }

    public int getPayment() {
        while (true) {
            System.out.println("Chose the pay system");
            System.out.println("1 - credit card");
            System.out.println("2 - online wallet");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("invalid chose");
            }
        }
    }

    public void menu() {
        String product = getProduct();
        int price = getPrice();
        Client client = new Client();
        client.setBill(product, price);
        switch (getPayment()) {
            case 1 -> {
                CreditCard card = new CreditCard();
                card.pay(client.getBill());
            }
            case 2 -> {
                OnlineWallet wallet= new OnlineWallet();
                wallet.pay(client.getBill());
            }
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.menu();
    }
}
