package com.github.kazuhito_m.samples.replacetypecodewithsubclasses;

public abstract class Shape {

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    protected Shape(int startx, int starty, int endx, int endy) {
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public abstract int getTypecode();

    public String getName() {
        return this.getClass().getSimpleName().toUpperCase();
    }

    public void draw() {
        String name = this.getClass().getSimpleName();
        System.out.println("draw" + name + ": " + this.toString());
    }

    public String toString() {
        return String.format("[ %s, (%d, %d)-(%d, %d) ]", getName(), _startx, _starty, _endx, _endy);
    }

}
