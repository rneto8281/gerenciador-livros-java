package src.br.com.beachhugo.booklib;

import java.time.LocalDate;

public class Book {
    
    private String title;
    private String author;
    private LocalDate publicationDate;
    private int popularityLevel;

    public Book(String title, String author, LocalDate publicationDate, int popularityLevel) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.popularityLevel = popularityLevel;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getPopularityLevel() {
        return popularityLevel;
    }

    @Override
    public String toString() {
        return "Livro: '" + title + "' | Autor: " + author + " | Lançamento: " + publicationDate + " | Popularidade: " + popularityLevel + "/5";
    }
}