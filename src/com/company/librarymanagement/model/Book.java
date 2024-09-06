package com.company.librarymanagement.model;

public class Book {

    private  int booid;
    private String title;
    private String author;
    private String gener ;
    private int publicationyear;
    private int availableCopies;

    public Book()
    {

    }

    public Book(int booid, String title, String author, String gener, int publicationyear, int availableCopies) {
        this.booid = booid;
        this.title = title;
        this.author = author;
        this.gener = gener;
        this.publicationyear = publicationyear;
        this.availableCopies = availableCopies;
    }

    public Book(String title, String author, String gener, int publicationyear, int availableCopies) {
        this.title = title;
        this.author = author;
        this.gener = gener;
        this.publicationyear = publicationyear;
        this.availableCopies = availableCopies;
    }

    public int getBooid() {
        return booid;
    }

    public void setBooid(int booid) {
        this.booid = booid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    public void setPublicationyear(int publicationyear) {
        this.publicationyear = publicationyear;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }


    public String toString() {
        return "Book{" +
                "booid=" + booid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", gener='" + gener + '\'' +
                ", publicationyear=" + publicationyear +
                ", availableCopies=" + availableCopies +
                '}';
    }
}
