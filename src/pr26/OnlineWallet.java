package pr26;

import java.util.HashMap;

public class OnlineWallet implements PayStrategy {
    @Override
    public void pay(HashMap<String, Integer> bill) {
        System.out.println("using online wallet");
        System.out.println("your order:\n" + bill);
    }
}
