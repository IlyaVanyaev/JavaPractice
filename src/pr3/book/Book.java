package pr3.book;

public class Book {
    private String author;
    private String title;
    private int year;

    Book (String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    Book(){}

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "book " + title + " by " + author + ", " + year;
    }
}
