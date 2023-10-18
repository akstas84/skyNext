package org.sky.cource1.lesson1;

public class LibraryReference {
    public static void main(String[] args) {
        Author authorCookBook = new Author("Vasya", "Povar");
        Author authorSpringBook = new Author("Anton", "Raskazov");

        Book cookBook = new Book("Cook Book", authorCookBook, 2023);
        Book springBook = new Book("Spring Book", authorSpringBook, 2022);

        springBook.setYear(2023);
    }
}