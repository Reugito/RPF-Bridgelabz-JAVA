package com.bridgelabz.programc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("om", "Raore", "sad");
		
		list.stream().map(s -> s.length()).forEach(System.out::println );
	
	
	}

}
