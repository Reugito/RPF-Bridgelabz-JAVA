package com.bridgelabz.programs;
import java.io.File;

public class DirFileCounter {
  public static void main(String args[]){
    File directory = new File("D:");
    int fileCount = directory.list().length;
    System.out.println("File Count:"+fileCount);
  }
}
