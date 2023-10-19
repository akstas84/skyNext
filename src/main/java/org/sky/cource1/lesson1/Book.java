package org.sky.cource1.lesson1;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorFullName;
    private int year;

    public Book(String nameBook, Author authorFullName, int year) {
        this.nameBook = nameBook;
        this.authorFullName = authorFullName;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "Имя книги='" + nameBook + ", Полное имя автора=" + authorFullName + ", год=" + year + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorFullName, book.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorFullName, year);
    }
}
