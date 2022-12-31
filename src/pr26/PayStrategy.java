package pr26;

import java.util.HashMap;

public interface PayStrategy {
    void pay(HashMap<String, Integer> bill);
}
