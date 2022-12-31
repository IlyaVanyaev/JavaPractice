package trash.p3.circle;

public class Sequence {
    public static void main (String[] args){
        int[] m = new int[4];
        for (int i = 0; i < 4; i++) m[i] = (int) (Math.random() * 90) + 10;
        for (int i = 0; i < 4; i++) System.out.print(m[i] + " ");
        System.out.println();
        for (int i = 1; i < 4; i++){
            if (m[i - 1] > m[i]) {
                System.out.println("no");
                break;
            }
            else if (m[i - 1] == m[i]){
                System.out.println("no");
                break;
            }
            if (i == 3) System.out.println("yes");
        }
    }
}
