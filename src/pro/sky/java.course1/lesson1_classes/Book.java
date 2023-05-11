package pro.sky.java.course1.lesson1_classes;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object object) {
        Book book = (Book) object;
        return (this.author.equals(book.author) && this.year == book.year && this.name.equals(book.name));
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.author + this.name + this.year);
    }
    @Override
    public String toString() {
        return this.name + " " + this.author.toString() + " " + this.year;
    }

}
