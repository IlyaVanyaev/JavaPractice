package pr2.dog;

public class Dog {
    private String name;
    private int age;

    Dog () {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int humanAge (){
        int humanage = this.age * 7;
        return humanage;
    }

    public String toString(){
        return "Dog: " + name + ", age: " + age;
    }
}
