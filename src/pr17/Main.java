package pr17;

public class Main {
    public static void main (String[] args){
        Season x = Season.Autumn;
        System.out.println(x.getFavorite(x));
        for (Season i : Season.values()){
            System.out.println(i.getSeason(i) + ", average temperature: " + i.getTemperature() + ", " + i.getDescription());
        }
    }
}
