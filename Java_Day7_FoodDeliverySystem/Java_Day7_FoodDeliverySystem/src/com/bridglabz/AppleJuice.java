package com.bridglabz;

public class AppleJuice extends FoodItmes implements IVeg {
	public AppleJuice() {
		type = Type.VEG ;
		catagory = Category.JUICE;
		tast = Test.SWEET;
		preparationTime = 10;
		name = "AppleJuice";
	}
}
