package trash.p2;

public class SwapString {
    public static void main (String[] args){
        String[] m = {"one", "two", "three", "four", "five"};
        String temp;
        for (int i = 0; i < m.length / 2; i++){
            temp = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = temp;
        }
        for (String s : m) System.out.print(s + " ");
    }
}
