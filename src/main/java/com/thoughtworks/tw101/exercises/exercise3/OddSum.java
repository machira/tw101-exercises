package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0;
        for (int i = 0; i < end; i++) {
            if(i%2 == 1){
                sum += i;
                i+=1;
            }
        }
        return sum;
    }
}
