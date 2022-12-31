package pr6;

public class Yacht implements Priceable{
    private int price;

    Yacht(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
