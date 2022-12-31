package trash.p3.circle;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class InternetShop {
    NumberFormat nf;
    private double cur;
    private String[] cargo = {"car", "house", "plane", "yacht"};

    public void getCargo(){
        for (String s : cargo) System.out.println(s);
    }

    public void buyCargo(){
        Scanner input = new Scanner(System.in);
        System.out.print("type a cargo id: ");
        int id = input.nextInt();
        if (id == 1) {
            setCurrency();
            System.out.println("final prize of " + cargo[0] + ": " + nf.format(1236737/cur));
        }
        else if (id == 2) {
            setCurrency();
            System.out.println("final prize of " + cargo[1] + ": " + nf.format(436356743/cur));
        }
        else if (id == 3){
            setCurrency();
            System.out.println("final prize of " + cargo[2] + ": " + nf.format(56723145/cur));
        }
        else if (id == 4) {
            setCurrency();
            System.out.println("final prize of " + cargo[3] + ": " + nf.format(91256370/cur));
        }
    }

    public void setCurrency(){;
        Scanner val = new Scanner(System.in);
        System.out.print("which currency do you want to use? - ");
        String currency = val.nextLine();
        if (Objects.equals(currency, "rub")) {
            nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
            cur = 1;
        }
        else if (Objects.equals(currency, "eur")) {
            nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            cur = 62.45;
        }
        else if (Objects.equals(currency, "usd")) {
            nf = NumberFormat.getCurrencyInstance(Locale.US);
            cur = 60.37;
        }
        else System.out.println("invalid currency");
    }

    public static void main(String[] args){
        InternetShop x = new InternetShop();
        x.getCargo();
        x.buyCargo();
    }
}
