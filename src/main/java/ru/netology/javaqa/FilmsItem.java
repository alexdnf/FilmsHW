package ru.netology.javaqa;

public class FilmsItem {
    private int filmNumber;
    private String filmName;
    private String filmGenre;
    public FilmsItem(int filmNumber, String filmName, String filmGenre) {
        this.filmNumber = filmNumber;
        this.filmName = filmName;
        this.filmGenre = filmGenre;

    }
    public int getFilmNumber() {
        return filmNumber;

    }
    public void setFilmNumber() {
        this.filmNumber = filmNumber;

    }
    public String getFilmName() {
        return filmName;

    }
    public void setFilmName() {
        this.filmName = filmName;

    }
    public String getFilmGenre() {
        return filmGenre;

    }
    public void setFilmGenre() {
        this.filmGenre = filmGenre;

    }
}
