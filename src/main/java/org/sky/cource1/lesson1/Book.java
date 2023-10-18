package org.sky.cource1.lesson1;

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
}
