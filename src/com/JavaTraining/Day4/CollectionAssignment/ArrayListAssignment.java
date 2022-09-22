package com.JavaTraining.Day4.CollectionAssignment;

import java.util.*;

public class ArrayListAssignment {
    private ArrayList<String> arr= new ArrayList<>();
    ArrayListAssignment(){
        this.arr.add("Red");
        this.arr.add("Blue");
        this.arr.add("Green");
        this.arr.add("yellow");
    }
    void itrateThrough(){
        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    void inserAtFirst(String str){
        this.arr.add(0,str);
    }
    String getAtIndex(int index){
        return this.arr.get(index);
    }
    void insertElementAtIndex(int index,String ele){
        this.arr.set(index,ele);
    }
    String removeFromThird(){
        if(this.arr.size()>3){
            return this.arr.remove(3);
        }
        return "-1";
    }
    int searchElement(String ele){
       return  this.arr.indexOf(ele);
    }
    void sort(){
        this.arr.sort((a,b)->a.charAt(0)-b.charAt(0));
    }
    void trimToSizeMtd(){
        this.arr.trimToSize();
    }
    void emptyArr() {
        this.arr.clear();
    }
    void increaseSizeMtd(int size){
        this.arr.ensureCapacity(this.arr.size()+size);
    }
    boolean compareArr(ArrayList a,ArrayList b){
        return  a.equals(b);
    }
    void insertAtSecond(String ele){
        this.insertElementAtIndex(2,ele);
    }
    void joinTwoArrayList(ArrayList a,ArrayList b){
        a.addAll(b);
    }
    boolean isArrayListEmpty(ArrayList a){
        return a.isEmpty();
    }
    void cloneArr(ArrayList a){
        a.clone();
    }
    void reverseArrayList(ArrayList a){
       Collections.reverse(a);
    }
    void shuffleArrayList(ArrayList a){
        Collections.shuffle(a);
    }
    List<String> subList(int start, int end){
        return this.arr.subList(start,end);
    }
    void Swap(ArrayList a,int idx1,int idx2){
        Collections.swap(a,idx1,idx2);
    }
}
