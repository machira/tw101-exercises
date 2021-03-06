package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float areaSum = 0;
        for(Rectangle rectangle : rectangles){
            areaSum += rectangle.area();
        }
        return areaSum/rectangles.length;
    }
}
