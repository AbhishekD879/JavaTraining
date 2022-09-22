package com.JavaTraining.Day7.Movie;

import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    private String rating="PG";
    Movie(String title, String studio, String rating){
        this.title = title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
    }
    Movie[] getPG(Movie[] movies){
        return (Movie[]) Arrays.stream(movies).filter(movie->movie.getRating().contains("PG")||movie.getRating().contains("pg")).toArray();
    }
}
