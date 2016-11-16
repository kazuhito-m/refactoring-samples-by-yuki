package com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape;

import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.Shape;

public class Line extends Shape {

    public Line(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public int getTypecode() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }

}
