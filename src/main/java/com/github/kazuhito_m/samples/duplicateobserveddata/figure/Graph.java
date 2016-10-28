package com.github.kazuhito_m.samples.duplicateobserveddata.figure;

import com.github.kazuhito_m.samples.duplicateobserveddata.value.ValueChangeEvent;
import com.github.kazuhito_m.samples.duplicateobserveddata.value.ValueListener;

import java.awt.*;

/**
 * 「円グラフ」を表すGUIクラス。
 */
public class Graph extends Canvas implements ValueListener {

    public static final int RECTANGLE = 0;
    public static final int CIRCLE = 1;

    protected int graphValue;

    /**
     * ファクトリメソッド。
     */
    public static Graph createGraph(int type, int width, int height) {
        Graph graph = null;
        if (type == RECTANGLE) {
            graph = new RectangleGraph();
        } else if (type == CIRCLE) {
            graph = new CircleGraph();
        } else {
            throw new RuntimeException("引数がおかしいです。図形タイプを指定してください。");
        }
        graph.setSize(new Dimension(width, height));
        return graph;
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        graphValue = e.getSoruce().getValue();
        repaint();
    }

}
