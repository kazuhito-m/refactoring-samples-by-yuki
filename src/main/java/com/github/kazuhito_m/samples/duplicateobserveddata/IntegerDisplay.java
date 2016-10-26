package com.github.kazuhito_m.samples.duplicateobserveddata;

import lombok.experimental.Delegate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {

    private final Label _octalLabel = new Label("0");
    private final Label _decimalLabel = new Label("0");
    private final Label _hexadecimalLabel = new Label("0");
    private final Button _incrementButton = new Button("+");
    private final Button _decrementButton = new Button("-");

    @Delegate
    private Value value = new Value(0);

    public IntegerDisplay() {
        super("IntegerDisplay");

        // 表示物を自身に追加。
        setLayout(new GridLayout(4, 2));
        add(new Label("Octal:"));
        add(_octalLabel);
        add(new Label("Decimal:"));
        add(_decimalLabel);
        add(new Label("Hexadecimal:"));
        add(_hexadecimalLabel);
        add(_incrementButton);
        add(_decrementButton);

        // ボタンの押下イベントを拾うため、リスナーとして自身オブジェクトを登録。
        _incrementButton.addActionListener(this);
        _decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 値オブジェクトにリスナーとして自身を加える。
        this.value.addValueListener(this);

        pack();
        setVisible(true);
    }

    /**
     * ボタン押下時のイベント。
     *
     * @param e イベント。
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Button) {
            Button b = (Button) e.getSource();
            int plusMinus1 = Integer.parseInt(b.getLabel() + "1");
            this.value.add(plusMinus1);
        }
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        if (e.getSoruce() == this.value) {
            int v = this.value.getValue();
            _octalLabel.setText(Integer.toString(v, 8));
            _decimalLabel.setText(Integer.toString(v, 10));
            _hexadecimalLabel.setText(Integer.toString(v, 16));
        }
    }
}
