package pro.sky.java.course1.lesson1_classes;

public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Максим","Горький");
        Author author2 = new Author("Александр","Солженицын");

        Book book1 = new Book("На дне",author1,1902);
        Book book2 = new Book("Архипелаг ГУЛАГ",author2,1973);

        Author author3 = new Author("Максим", "Горький");
        System.out.println(author3.equals(author1));
        System.out.println(author3);
        System.out.println(book1);
        System.out.println(author1.hashCode());
        System.out.println(author3.hashCode());





    }
}