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

        int x, y, w, h;

        // 符号と加算率を計算。
        int sign = +1;
        int minusWidthOn = 0;
        if (graphValue <= 0) {
            sign = -1;
            minusWidthOn = 1;
        }

        // 座標を計算。
        w = (int) (bounds.width / 2 * (sign * graphValue) / 100.0);
        h = bounds.height / 2;
        x = bounds.width / 2 - (w * minusWidthOn);
        y = bounds.height / 4;

        g.fillRect(x, y, w, h);
    }

}
