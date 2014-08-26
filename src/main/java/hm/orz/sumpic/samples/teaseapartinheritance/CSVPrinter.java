package hm.orz.sumpic.samples.teaseapartinheritance;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class CSVPrinter {

	protected final CSVReader _csvReader;
	
	protected CSVPrinter(CSVReader reader) {
		_csvReader = reader;
	}
	
    public abstract void print() throws IOException;

    public abstract String[] readCSV() throws IOException;
    
}
