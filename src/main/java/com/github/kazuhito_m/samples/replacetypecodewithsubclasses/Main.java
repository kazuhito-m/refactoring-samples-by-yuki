package com.github.kazuhito_m.samples.replacetypecodewithsubclasses;

import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape.Line;
import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape.Oval;
import com.github.kazuhito_m.samples.replacetypecodewithsubclasses.shape.Rectangle;

public class Main {

    public static void main(String[] args) {

        Shape line = new Line(0, 0, 100, 200);
        Shape rectangle = new Rectangle(10, 20, 30, 40);
        Shape oval = new Oval(100, 200, 300, 400);

        Shape[] shape = {
                line, rectangle, oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }

}
