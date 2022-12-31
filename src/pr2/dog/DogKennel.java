package pr2.dog;

import java.util.Scanner;

public class DogKennel {
    private int a = 5, i = 0;
    private Dog[] m = new Dog[a];

    public void addDog(String name, int age){
        if (i < a) {
            m[i] = new Dog();
            m[i].setName(name);
            m[i].setAge(age);
            i++;
        }

    }

    public void getDog(){
        System.out.println(m[i]);
        i++;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Scanner am = new Scanner(System.in);
        DogKennel x = new DogKennel();
        System.out.print("amount of dogs (up to 5): ");
        int amount = am.nextInt();
        for (int j = 0; j < amount; j++) {
            System.out.print("enter the dog: ");
            String name = input.nextLine();
            x.addDog(name, j+2);
        }
        x.i = 0;
        for (int j = 0; j < amount; j++) {
            x.getDog();
        }
        x.i = 0;
        for (int j = 0; j < amount; j++) {
            System.out.println("human age of dog " + x.m[x.i].getName() + " is " + x.m[x.i].humanAge());
            x.i++;
        }

    }
}
