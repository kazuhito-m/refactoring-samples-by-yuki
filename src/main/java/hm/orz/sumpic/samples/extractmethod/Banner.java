package hm.orz.sumpic.samples.extractmethod;

public class Banner {

    private final String _content;
    
    public Banner(String content) {
        _content = content;
    }

    public void print(int times) {
        printBorder();

        // Prints content.
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }

        // Prints border.
        printBorder();
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
