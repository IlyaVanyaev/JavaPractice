package trash.p3.circle;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    private double ruble;
    private double euro = 62.45;
    private double dollar = 60.37;

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }

    public double toEuro (){
        return ruble / euro;
    }

    public double toDollar (){
        return ruble / dollar;
    }

    public static void main(String[] args){
        NumberFormat nf;
        Scanner ch = new Scanner(System.in);
        Scanner rub = new Scanner(System.in);
        CurrencyConverter x = new CurrencyConverter();
        int choice;
        System.out.print(
                """
                        Welcome to Currency Converter
                        -----------------------
                        1 - Ruble to Euro
                        2 - Ruble to Dollar
                        -----------------------
                        """
        );
        while (true) {
            System.out.print("which option? - ");
            choice = ch.nextInt();
            if (choice == 0) {
                System.out.println("finished");
                break;
            }
            else if (choice == 1){
                nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.print("how much? - ");
                double ruble = rub.nextDouble();
                x.setRuble(ruble);
                System.out.println(nf.format(x.toEuro()));
            }
            else if (choice == 2){
                nf = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.print("how much? - ");
                double ruble = rub.nextDouble();
                x.setRuble(ruble);
                System.out.println(nf.format(x.toDollar()));
            }
        }
    }
}
