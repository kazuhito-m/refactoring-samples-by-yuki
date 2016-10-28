package com.github.kazuhito_m.samples.duplicateobserveddata.figure;

import java.awt.*;

/**
 * 「長方形」図形クラス。
 */
public class RectangleGraph extends Graph {

    @Override
    public void paint(Graphics g) {
        g.setColor(this.graphValue > 0 ? Color.BLUE : Color.RED);
        Rectangle bounds = getBounds();

        int sign;
        int minusWidthOn = 0;
        if (graphValue > 0) {
            sign = +1;
            minusWidthOn = 0;
        } else {
            sign = -1;
            minusWidthOn = 1;
        }
        int x, y, w, h;
        w = (int) (bounds.width / 2 * (sign * graphValue) / 100.0);
        h = bounds.height / 2;
        x = bounds.width / 2 - (w * minusWidthOn);
        y = bounds.height / 4;
        g.fillRect(x, y, w, h);
    }

}
