package com.thoughtworks.tw101.exercises.exercise1;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = oddNumberList(0,100);
        System.out.println(list);
        System.out.println(sumOfList(list));
    }

    public static List<Integer> oddNumberList(int start, int end){
        List<Integer> list = new ArrayList<Integer>(Math.abs((start-end)/2));
        for (int i = start; i < end; i++) {
            if (i%2 == 1){
                list.add(i);
                i++;
            }
        }
        return list;
    }

    public static int sumOfList(List<Integer> list){
        int i = 0;
        for(Integer integer: list){
            i += integer;
        }
        return i;
    }
}
