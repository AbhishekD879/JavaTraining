package com.JavaTraining.Day6.GenericsAssignment1.WithoutGenerics;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private List<Book> books = new ArrayList<Book>();
    public void add(Book x) {
        this.books.add(x);
    }

    Book peek() {
        return this.books.get(this.books.size() - 1);
    }

    public Book removeFromeEnd() {
        return this.books.remove(this.books.size() - 1);
    }

    int size() {
        return this.books.size();
    }
}
