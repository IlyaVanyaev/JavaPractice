package pr26;

import java.util.HashMap;

public class CreditCard implements PayStrategy {
    @Override
    public void pay(HashMap<String, Integer> bill) {
        System.out.println("using credit card");
        System.out.println("your order:\n" + bill);
    }
}
