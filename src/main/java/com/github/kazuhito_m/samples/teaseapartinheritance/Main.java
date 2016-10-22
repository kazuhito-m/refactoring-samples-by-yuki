package com.github.kazuhito_m.samples.teaseapartinheritance;

import java.io.*;

public class Main {
    private static final String SAMPLE_CSV_STRING =
          "おはよう,Good morning.\n"
        + "こんにちは,Hello.\n"
        + "こんばんは,Good evening.\n"
        + "おやすみ,Good night.\n";

    public static void main(String[] args) throws IOException {
    	String csvFile = args[0];
        new CSVTablePrinter(new CSVStringReader(SAMPLE_CSV_STRING)).print();
        new CSVFileTreePrinter(csvFile).print();
    }

}
