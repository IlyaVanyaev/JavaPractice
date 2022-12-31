package pr6;

public class Main {
    public static void main(String[] args){
        Person x = new Person("Paul");
        Planet y = new Planet("Mars");
        House z = new House(2000000);
        Yacht w = new Yacht(5000000);
        System.out.println("this is "+x.getName()+" that lives on "+y.getName()+" in house "+z.getPrice()+" dollars cost and has a yacht that was bought for "+w.getPrice()+" dollars");
    }
}
