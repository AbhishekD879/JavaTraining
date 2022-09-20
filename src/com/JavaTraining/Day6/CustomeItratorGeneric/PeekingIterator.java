package com.JavaTraining.Day6.CustomeItratorGeneric;

import java.util.Iterator;

public class PeekingIterator<T> implements Iterator {

    private Iterator<T> iterator;
    private T currentValue;
    PeekingIterator(Iterator<T> nums){
        this.iterator = nums;
        this.currentValue = iterator.hasNext() ? iterator.next() : null;
    }

    @Override
    public boolean hasNext() {
        return currentValue!=null;
    }

    @Override
    public T next() {
        T valToReturn = currentValue;
        this.currentValue = iterator.hasNext() ? iterator.next() : null;
        return valToReturn;
    }
    public T peek(){
        return currentValue;
    }
}
