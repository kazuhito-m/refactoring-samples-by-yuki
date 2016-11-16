package com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape;

import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.Shape;

public class Rectangle extends Shape {

    public Rectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public int getTypecode() {
        return 1;
    }

}
