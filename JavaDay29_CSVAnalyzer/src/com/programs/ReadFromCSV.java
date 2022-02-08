package com.programs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReadFromCSV {
    public static void main(String[] args) {
        String filePath = "D:read.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                List<String> al = Arrays.asList(array);
                HashSet<String> hashSet = new HashSet<>(al);
                System.out.println(array.length+" = "+ hashSet.size());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}