package com.programs;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVAnalyzer {

	public static void main(String args[])
	{
	    try {
	 
	        FileReader filereader = new FileReader("D:read.csv");
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	 
	        while ((nextRecord = csvReader.readNext()) != null) {
				 for (String cell : nextRecord) { System.out.print(cell + " "); }
				
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
