package com.JavaTraining.Day6.GenericsAssignment1.WithoutGenerics;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private List<Book> Video = new ArrayList<>();
    public void add(Book x) {
        this.Video.add(x);
    }

    Book peek() {
        return this.Video.get(this.Video.size() - 1);
    }

    public Book removeFromeEnd() {
        return this.Video.remove(this.Video.size() - 1);
    }

    int size() {
        return this.Video.size();
    }
}
