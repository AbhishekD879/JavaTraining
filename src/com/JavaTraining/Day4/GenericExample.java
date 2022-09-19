package com.JavaTraining.Day4;

import java.util.ArrayList;
import java.util.List;

class CustomStack<T>{
    private List<T> data=new ArrayList<T>();
    public void push(T x){
        this.data.add(x);
    }
    T peek(){
        return this.data.get(this.data.size()-1);
    }
    public T pop(){
        return this.data.remove(this.data.size()-1);
    }
    int size(){
        return this.data.size();
    }
}


public class GenericExample {
    public static void main(String[] args) {
        CustomStack<Integer> c= new CustomStack<>();
       c.push(1);
       c.push(2);
       c.push(4);
        System.out.println(c.pop());
        System.out.println(c.peek());
    }
}
