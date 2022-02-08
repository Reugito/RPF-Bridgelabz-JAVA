package com.bridgelabz.programs;

public class MoodAnalyzer {
	String message;
	
	public MoodAnalyzer(String message){
		this.message = message;
	}
	
	public String analyzeMood() throws CustomException {
		try {
			if(message.contains("Happy"))
				return "Happy";
			if(message.isEmpty())
				throw new CustomException("message is empty");
			return "SAD";
		}catch(Exception e) { throw new CustomException("message is Null");}
	}
}
