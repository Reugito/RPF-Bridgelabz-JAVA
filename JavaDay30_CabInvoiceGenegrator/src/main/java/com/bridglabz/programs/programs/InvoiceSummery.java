package com.bridglabz.programs.programs;

import java.util.Objects;

public class InvoiceSummery {

	private int numOfRiders;
	private double totalFare;
	private double avarage;

	public InvoiceSummery(int numOfRiders, double totalFare) {
		this.numOfRiders = numOfRiders;
		this.totalFare = totalFare;
		this.avarage = this.totalFare/this.numOfRiders;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummery other = (InvoiceSummery) obj;
		return Double.doubleToLongBits(avarage) == Double.doubleToLongBits(other.avarage)
				&& numOfRiders == other.numOfRiders
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}

}
