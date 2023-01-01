package pr5;

public class Main {
    public static void main(String[]args){
        Dish x = new Mug();
        Dish y = new Plate();

        x.setVolume(20);
        x.setShape("round");
        System.out.println(x.getVolume());
        System.out.println(x.getShape());
        System.out.println(x);

        y.setDepth(5);
        y.setShape("square");
        System.out.println(y.getDepth());
        System.out.println(y.getShape());
        System.out.println(y);

        Husky h = new Husky("friend",3);
        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h);

        Table t = new Table("Sovetsky");
        t.setColor("white");
        t.setCost(120);
        System.out.println(t);

        Table w = new Table("Loft");
        w.setColor("wood");
        w.setCost(500);

        Table l = new Table("LongBoy");
        l.setColor("brown");
        l.setCost(1000);

        FurnitureShop shop = new FurnitureShop(3);
        shop.addFurniture(t);
        shop.addFurniture(w);
        shop.addFurniture(l);
        shop.showFurniture();
    }
}
