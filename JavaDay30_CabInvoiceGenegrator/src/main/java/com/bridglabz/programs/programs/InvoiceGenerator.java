package com.bridglabz.programs.programs;

public class InvoiceGenerator {

	private static double MINIMUN_COST_PER_KM = 10;
	private static int COST_PER_Time = 1;
	private static double MINIMUM_Fare = 5;
	private static String choice = "premium";
	
	public void getRideType(String rideType) {
		if(rideType.equalsIgnoreCase(choice)) {
			MINIMUN_COST_PER_KM = 15;
			COST_PER_Time = 2;
			MINIMUM_Fare = 20;
		}
	}
	public double calculateFare(double distance, int time) {
		double totalFare =  distance * MINIMUN_COST_PER_KM + time * COST_PER_Time;
		return Math.max( MINIMUM_Fare, totalFare);
	}

	public InvoiceSummery calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride: rides) 
			totalFare += this.calculateFare(ride.distance, ride.time);
		return new InvoiceSummery(rides.length, totalFare);
	}
}
