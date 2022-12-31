package pr26;

import java.util.HashMap;

public class Client {

    private final HashMap<String, Integer> bill;

    public Client(){
        this.bill = new HashMap<>();
    }

    public void setBill(String product, int price){
        bill.put(product, price);
    }

    public HashMap<String, Integer> getBill(){
        return bill;
    }
}
