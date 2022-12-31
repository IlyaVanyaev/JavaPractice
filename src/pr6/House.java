package pr6;

public class House implements Priceable{
    private int price;

    House(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
