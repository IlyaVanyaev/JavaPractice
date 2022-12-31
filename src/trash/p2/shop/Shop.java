package trash.p2.shop;


import java.util.Objects;
import java.util.Scanner;


public class Shop {
    private String comp;
    private int i = 0, a;
    private Shop [] m;
    Scanner input = new Scanner(System.in);
    Scanner set = new Scanner(System.in);
    Shop (String comp){
        this.comp = comp;
    }
    Shop (){}

    public void setShop(){
        System.out.print("enter the amount of computers: ");
        a = set.nextInt();
        m = new Shop[a];
        System.out.println("Shop is available for now \n");
    }

    public void addComp(){
        if (i < a) {
            System.out.print("enter the name of computer: ");
            comp = input.nextLine();
            m[i] = new Shop(comp);
            System.out.println("completed\n");
            i++;
        }
        else {
            System.out.println("can't add a computer\n");
        }
    }

    public void deleteComp(){
        System.out.print("which computer to delete: ");
        String name = input.nextLine();
        for (int j = 0; j < i; j++){
            if (Objects.equals(m[j].comp, name)){
                m[j] = m[j+1];
                System.out.println("deleted\n");
                i--;
                break;
            }
            if (j == i - 1) System.out.println("there is no such computer\n");
        }
    }

    public void showAll(){
        System.out.println("-----------");
        for (int j = 0; j < i; j++) System.out.println(m[j]);
        System.out.println("-----------");
    }

    public void searchComp(){
        System.out.print("enter the name of computer to search: ");
        String name = input.nextLine();
        for (int j = 0; j < i; j++){
            if (Objects.equals(m[j].comp, name)){
                System.out.println(m[j] + "\n");
                break;
            }
            if (j == i - 1) System.out.println("there is no such computer\n");
        }


    }

    public void showI(){
        System.out.println(i + "\n");
    }

    public String toString (){
        return comp;
    }


}
