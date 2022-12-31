package pr4.author;

public class TestAuthor {
    public static void main (String [] args){
        Author x = new Author("Igor","igor.ru",'m');
        System.out.println(x.getName());
        System.out.println(x.getEmail());
        System.out.println(x.getGender());
        x.setEmail("igor-gor@mal.ru");
        System.out.println(x.getEmail());
        System.out.println();
        System.out.println(x);
    }
}
