package pro.sky.java.course1.lesson1_classes;

public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Максим","Горький");
        Author author2 = new Author("Александр","Солженицын");

        Book book1 = new Book("На дне",author1,1902);
        Book book2 = new Book("Архипелаг ГУЛАГ",author2,1973);



    }
}