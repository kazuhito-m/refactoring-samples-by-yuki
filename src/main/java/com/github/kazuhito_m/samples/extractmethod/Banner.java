package com.github.kazuhito_m.samples.extractmethod;

public class Banner {

    private final String _content;

    public Banner(String content) {
        _content = content;
    }

    public void print(int times) {
        printBorder();
        printContent(times);
        printBorder();
    }

    /**
     * Prints content.
     *
     * @param times 繰り返す数。
     */
    private void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }
    }

    /**
     * Prints border.
     */
    private void printBorder() {
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
