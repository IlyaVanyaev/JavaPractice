package pr13;

import java.util.Arrays;
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        String str1 = new String("This");
        String str2 = new String("is");
        String str3 = new String("test data");

        LinkedList<String> ls = new LinkedList<>();
        //добавление элемента
        ls.add(str1);
        ls.add(str2);
        ls.add(str3);
        System.out.println(ls);

        String str4 = new String("not");
        //добавление элемента на место указанного индекса
        ls.add(2,str4);
        System.out.println(ls);
        //удаление элемента под указзаным индексом
        ls.remove(1);
        System.out.println(ls);

        String str5 = "first";
        String str6 = "last";

        ls.addFirst(str5);//добавление в начало списка
        ls.addLast(str6);//добавление в конец списка

        System.out.println(ls);

        System.out.println(ls.peekLast()); //вывод последнего элемента списка
        System.out.println(ls.peekFirst()); //вывод первого элемента списка

        System.out.println(ls.pollFirst()); //вывод и удаление первого элемента
        System.out.println(ls.pollLast());  // вывод и удаление последнего элемента
        System.out.println(ls);

        String[] array = ls.toArray(new String[3]); //возврат массива из элементов списка
        System.out.println(Arrays.toString(array));
        for (int i=0;i<3;i++) System.out.print(array[i]+" ");


    }
}
