public class Book{
    String name;
    int year;
    Author author;
    public Book(){}
    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Author getAuthor(){
        return this.author;
    }
}
