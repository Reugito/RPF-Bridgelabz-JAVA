package com.bridglabz;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FoodManager {
	Set<FoodItmes> foodList = new HashSet();
	Scanner sc = new Scanner(System.in);
	
	private static FoodManager instance;
	
	private FoodManager() {}
	
	public static synchronized FoodManager getInstance() {
		if(instance == null) 
			instance = new FoodManager();
		return instance;
	}
	
	void addFoodItems(FoodItmes foodItmes) {
		foodList.add(foodItmes);
	}
	
	void printFoodItems() {
		/*
		 * for(FoodItmes Items: foodList) { System.out.println(Items); }
		 */
		foodList.stream().forEach(System.out::println);
	}
	
	void removeItem() {
		System.out.print("Enter food item name: ");
		String name = sc.next();
		FoodItmes foodItme = getFoodItem(name);
		if(foodItme != null) {
			foodList.remove(foodItme);
			System.out.println("------"+name+" is removed from food list-------");
			return;
		}
			System.out.println("------"+name+" is not in the list-------");
	}
	
	void printAllVegItems() {
		foodList.stream().filter(item -> (item.type.equals(item.type.VEG))).forEach(System.out::println);
	}
	
	public int getFoodCount() {
		return foodList.size();
	}
	
	void printAllNonVegItems() {
		/*
		 * for(FoodItmes elements: foodList) { if(elements instanceof INonVeg)
		 * System.out.println(elements); }
		 */
		foodList.stream().filter(item -> (item.type.equals(item.type.NONVEG))).forEach(System.out::println);
	}
	
	FoodItmes getFoodItem(String name) {
		Iterator iterator = foodList.iterator();
		for(FoodItmes elements : foodList ) {
			if (iterator.hasNext()) {
				FoodItmes fooditem = (FoodItmes) iterator.next();
				if(fooditem.name.equalsIgnoreCase(name)) {
					return fooditem;
				}
			}		
		}
		return null;	
	}
	
	public FoodItmes fooditem(String name) {
		List<FoodItmes> result = foodList.stream().filter(item -> item.name.equalsIgnoreCase(name)).collect(Collectors.toList());
		if(!result.isEmpty())
			return result.get(0);
		return null;
	}
}
