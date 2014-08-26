package hm.orz.sumpic.samples.teaseapartinheritance;

import java.io.*;

public class CSVStringReader extends CSVReader {
    public CSVStringReader(String string) {
        super(new BufferedReader(new StringReader(string)));
    }
}
