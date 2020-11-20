package com.company.homework8;

public class Movie {
    private String movie;
    private int reting;

    public Movie() {
    }

    public Movie(String movie, int reting) {
        this.movie = movie;
        this.reting = reting;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getReting() {
        return reting;
    }

    public void setReting(int reting) {
        this.reting = reting;
    }
}
