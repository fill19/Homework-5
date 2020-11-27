package com.Cursor.java;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyList<>();
        numbers.add(4);
        numbers.add(447);
        numbers.add(646);
        numbers.add(4124);
        numbers.add(52);
        System.out.println("Smallest Number is: " + numbers.SmallestValue());
        //output smallest
        System.out.println("Largest number is: " + numbers.LargestValue());

        System.out.println("\n");

        MyList<Double> numbs = new MyList<>();
        numbs.add(14.5);
        numbs.add(5425.636);
        numbs.add(1.5856);
        numbs.add(423.556);
        numbs.add(10.5412345);
        double Smallest = numbs.SmallestValue();
        double Largest = numbs.LargestValue();
        System.out.println("Smallest Number is : " + Smallest);
        //output smallest
        System.out.println("Largest number is :" + Largest);
    }
}


class MyList<T extends Number> {
    ArrayList<T> myList = new ArrayList<>();

    private T numb;

    public void add(T numb) {
        this.numb = numb;
        myList.add(numb);


    }

    public T SmallestValue() {
        T value = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).intValue() < value.intValue()) {
                value = myList.get(i);
            }

        }
        return value;
    }


    public T LargestValue() {
        T value = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).intValue() > value.intValue()) {
                value = myList.get(i);
            }
        }
        return value;
    }
}



