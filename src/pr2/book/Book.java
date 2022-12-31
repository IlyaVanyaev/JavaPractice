package pr2.book;

public class Book {
    private String title;
    private String author;
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor() { return author; }

    public static void main(String[]args){
        Book b = new Book();
        b.setTitle("Onegin book");
        b.setAuthor("Pushkin");
        System.out.println("tittle of the book is "+b.getTitle());
        System.out.println("author of the book is "+b.getAuthor());
    }

}
