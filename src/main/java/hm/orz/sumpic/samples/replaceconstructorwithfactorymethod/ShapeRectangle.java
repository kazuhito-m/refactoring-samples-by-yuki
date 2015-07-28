package hm.orz.sumpic.samples.replaceconstructorwithfactorymethod;

/**
 * Created by kazuhito_m on 15/07/29.
 */
public class ShapeRectangle extends Shape {

    protected ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);

    }

    @Override
    public void draw() {
        System.out.println("drawRectangle: " + this.toString());
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }
}
