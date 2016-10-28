package com.github.kazuhito_m.samples.duplicateobserveddata.figure;

import java.awt.*;

/**
 * 「円形」図形クラス。
 */
public class CircleGraph extends Graph {

    @Override
    public void paint(Graphics g) {
        g.setColor(this.graphValue > 0 ? Color.BLUE : Color.RED);
        Rectangle bounds = getBounds();
        int startAngle = 90;
        int endAngle = -(int) (this.graphValue * 10.0);
        g.fillArc(0, 0, bounds.width, bounds.height, startAngle, endAngle);
    }

}
