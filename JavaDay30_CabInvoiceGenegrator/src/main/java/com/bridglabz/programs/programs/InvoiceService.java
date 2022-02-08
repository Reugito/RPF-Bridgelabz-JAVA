package com.bridglabz.programs.programs;

import java.util.Arrays;
import java.util.Objects;

public class InvoiceService {

	private static  String invoice ;
	private String userID;
	private Ride[] rides;
	private InvoiceSummery totalfare;

	public InvoiceService(String userID, Ride[] rides) {
		this.userID = userID;
		this.rides = rides;
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		this.totalfare = invoiceGenerator.calculateFare(rides);
		this.invoice = userID+", "+rides+", "+totalfare;
	}
}
