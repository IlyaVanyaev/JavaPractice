package pr6;

public class Person implements Nameable{
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
