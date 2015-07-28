package hm.orz.sumpic.samples.replaceconstructorwithfactorymethod;

public abstract class Shape {

    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    Shape(int startx, int starty, int endx, int endy) {
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + _startx + ", " + _starty + ")-"
                + "(" + _endx + ", " + _endy + ") ]";
    }

    /**
     * 図形を描画する。
     */
    public abstract void draw();

    /**
     * 自身の名前を返す。
     * @return 名前。
     */
    public abstract String getName();

    /**
     * Lineのオブジェクトを作るファクトリメソッド。
     */
    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx,starty,endx,endy);
    }

    /**
     * Ovalのオブジェクトを作るファクトリメソッド。
     */
    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx,starty,endx,endy);
    }


    /**
     * Rectangleのオブジェクトを作るファクトリメソッド。
     */
    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx,starty,endx,endy);
    }


}
