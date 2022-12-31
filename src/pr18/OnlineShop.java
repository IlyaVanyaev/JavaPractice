package pr18;

import java.util.HashMap;
import java.util.Scanner;

public class OnlineShop {
    public static HashMap<Integer, String> clients = new HashMap<Integer, String>();

    private void checkINN(int INN) throws Exception{
        if (clients.get(INN) == null) throw new NullPointerException();
        else System.out.println("INN is checked");
    }

    public void setClients(){
        clients.put(7654321, "Дизель В.И.");
        clients.put(1265761, "Петров А.А.");
        clients.put(3662636, "Уокер П.П.");
        clients.put(9087596, "Джава Я.П.");
    }

    public void purchase(int INN) throws Exception{
        try {
            checkINN(INN);
            System.out.println("Thank you for a purchase,  " + clients.get(INN));
        } catch (NullPointerException e){
            System.out.println("Invalid INN");
        }
    }

    public static void main(String[] args) throws Exception{
        OnlineShop x = new OnlineShop();
        x.setClients();
        System.out.print("Type your INN: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        x.purchase(input);
    }
}
