package pr3.book;

public class Booktest {
    public static void main (String[] args){
        Bookshelf x = new Bookshelf();
        x.setShelf();
        x.getShelf();
        System.out.println(x.getEarly());
        System.out.println(x.getLate());
        x.sortShelf();
        x.getShelf();

    }
}
