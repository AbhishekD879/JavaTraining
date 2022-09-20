package com.JavaTraining.Day6.CustomeItratorGeneric;

import java.util.ArrayList;
import java.util.Arrays;

public class PeekingIteratorDriver {
    public static void main(String[] args) {
        PeekingIterator<Integer> pek= new PeekingIterator<>(new ArrayList(Arrays.asList(1,2,3)).iterator());
        System.out.println(pek.peek());
        System.out.println(pek.next());
        System.out.println(pek.peek());
        System.out.println(pek.hasNext());
    }
}
