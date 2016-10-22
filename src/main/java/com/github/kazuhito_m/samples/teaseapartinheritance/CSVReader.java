package com.github.kazuhito_m.samples.teaseapartinheritance;

import java.io.*;
import java.util.regex.*;

public class CSVReader {

	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
	
    protected final BufferedReader _bufReader;

	public CSVReader(BufferedReader bufReader) {
		_bufReader = bufReader;
	}
	
    protected String[] readCSV() throws IOException {
		String line = _bufReader.readLine();
		if (line == null) {
			return null;
		} else {
			String[] item = CSV_PATTERN.split(line);
			return item;
		}
    }

    public void close() throws IOException {
		_bufReader.close();
    }
    

}
