package pr29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setName("Euro");
        currencyInfo.setSymbol("€");
        currencyInfo.setExchangeRate(4.0);

        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("currency.ser"))) {
            out.writeObject(currencyInfo);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
