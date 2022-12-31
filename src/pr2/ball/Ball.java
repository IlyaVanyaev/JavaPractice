package pr2.ball;

public class Ball {
    private String type;

    Ball(String type){
        this.type=type;
    }
    public String toString(){
        return "this is ball for "+type;
    }

    public static void main(String[]args){
        Ball x = new Ball("basketball");
        System.out.println(x);
    }
}
