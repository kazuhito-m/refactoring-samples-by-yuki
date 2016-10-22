package com.github.kazuhito_m.samples.replaceconstructorwithfactorymethod;

/**
 * Created by kazuhito_m on 15/07/29.
 */
public class ShapeLine extends Shape {

    protected ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);

    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }

    @Override
    public String getName() {
        return "LINE";
    }
}
