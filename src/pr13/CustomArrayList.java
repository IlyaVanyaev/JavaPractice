package pr13;

import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] m;
    private int size;
    private int recentSize = 0;


    CustomArrayList(int size){
        this.size=size;
        if (size<=0) throw new IllegalArgumentException("Invalid size");
        else m=(T[]) new Object[size];
    }

    public void add(T el){
        if (recentSize >= size) resize(size*2);
        m[recentSize++] = el;
    }

    public void remove(int index){
        for (int i = index; i<recentSize; i++) m[i] = m[i+1];
        m[recentSize] = null;
        recentSize--;
        if (recentSize < size/2) resize(size/2);
    }

    public void show(){
        for (int i=0;i<size;i++) System.out.print(m[i] + " ");
        System.out.println();
    }

    private void resize(int newSize){
        Object[] nm = new Object[newSize];
        System.arraycopy(m,0,nm,0,recentSize);
        m = (T[]) nm;
        size = newSize;
    }

    public boolean isEmpty(){
        return recentSize == 0;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            remove(0);
        }
    }

    public int getSize(){
        return recentSize;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(m,size));
    }

    public T get(int index){
        return (T) m[index];
    }

    public void set(int index, T el){
        if (recentSize >= size) resize(size*2);
        m[index] = el;
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> x = new CustomArrayList<>(3);
        x.add(4);
        x.add(3);
        x.add(5);
        x.add(7);
        x.show();

        x.remove(0);
        x.show();

        check(x);
        x.clear();
        x.show();

        check(x);
        System.out.println(x.getSize());
        x.add(9);
        x.show();
        System.out.println(x.getSize());
        System.out.println(x);
        for (int i = 0; i < 3; i++) x.add(i+4);
        System.out.println(x);
        System.out.println(x.get(1));
        x.set(4,7);
        System.out.println(x);

    }

    public static void check(CustomArrayList x){
        if (x.isEmpty()) System.out.println("Empty");
        else System.out.println("Not empty");
    }

}
