package _2023_05_06;

import java.util.List;

public class Book {
    Author author;
    int issue;
}
class Author {
    String name;
    boolean sex;
    int age;
}

class Gen {
    List<Book> get() {
        return null;
    }
}

class Service {
    Author author;
    Book book;

    Gen gen;

    List<Book> m1(Author author, int year) {
        List<Book> list = new Gen().get();
        list.stream();
        return null;
    }

    List<Book> m1(Book book, Author author) {
        List<Book> list = new Gen().get();
        list.stream();
        return null;
    }
}