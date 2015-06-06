package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> oddNumberList(int start, int end){
        List<Integer> list = new ArrayList<Integer>(Math.abs((start-end)/2));
        for (int i = start; i < end; i+=2) {
            if (i%2 == 0){
                list.add(i);
            }
        }
        return list;
    }
}
