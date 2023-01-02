package pr13;

import java.util.ArrayList;

public class AList {

    public static void main(String[]args) {
        //создание
        ArrayList<String> x = new ArrayList<>();
        //добавление элемента
        x.add("Item");
        x.add("Data");
        //получение размера
        int size = x.size();
        System.out.println(size);
        //получение индекса элемента
        int index = x.indexOf("Data");
        System.out.println(index);
        //просмотр всех элементов
        for (int i = 0; i < x.size();i++){
            String item = x.get(i);
            System.out.println("Element " + i + " : " + item);
        }
        //проверка на путоту
        isEmpty(x);
        //удаление по индексу
        x.remove(0);
        //удаление по значению
        x.remove("Data");

        isEmpty(x);
        x.add("test");
        x.add("copy");
        x.add("data");


        //копирование
        ArrayList<String> copyx = new ArrayList<String>();
        copyx.addAll(x);
        showArray(copyx);

        //замена по индексу
        x.set(0,"test2");
        //просмотр всех элементов
        showArray(x);

        //очистка
        copyx.clear();
        isEmpty(copyx);
    }

    static void isEmpty(ArrayList x){
        boolean result= x.isEmpty();
        if (result) System.out.println("ArrayList is empty");
        else System.out.println("ArrayList is not empty");
    }

    static void showArray(ArrayList<String> x){
        for (int i = 0; i < x.size();i++){
            String item = x.get(i);
            System.out.println("Element " + i + " : " + item);
        }
    }

}
