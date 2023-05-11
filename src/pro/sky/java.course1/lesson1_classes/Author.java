package pro.sky.java.course1.lesson1_classes;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object object) {
        Author author = (Author) object;
        return (this.name.equals(author.name) && this.surname.equals(author.surname));
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(this.name + this.surname);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

}