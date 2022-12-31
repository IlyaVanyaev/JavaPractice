package pr3.human;

public class Human {
    private String name;
    private int age;
    Leg leg = new Leg();
    Head head = new Head();
    Hand hand = new Hand();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is "+name+", "+age+" years old");
        head.info();
        hand.info();
        leg.info();
    }

    public static void main (String[] args){
        Human x = new Human("Ivan", 20);
    }
}
