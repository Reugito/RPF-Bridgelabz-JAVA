package com.bridgelabz.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileTransfer {

	public static void main(String[] args) throws IOException {
		FileChannel source = null;
	    FileChannel destination = null;

	    try {
	        source = new FileInputStream("D:File1.txt").getChannel();
	        destination = new FileOutputStream("D:File2.txt").getChannel();
	        destination.transferFrom(source, 0, source.size());
	        System.out.println("File coppied successfully");
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
		
		 

	}

}
