package pr5;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop{
    private List<Furniture> shop;
    private int capacity;

    FurnitureShop(int capacity){
        this.capacity = capacity;
        shop = new ArrayList<>(capacity);
    }

    public void addFurniture(Furniture f){
        shop.add(f);
        System.out.println(f+" added");
    }

    public void showFurniture(){
        System.out.println(shop.toString());
    }
}
