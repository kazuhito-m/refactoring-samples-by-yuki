package com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape;

import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.Shape;

public class Oval extends Shape {

    public Oval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }


    @Override
    public int getTypecode() {
        return 2;
    }

}
