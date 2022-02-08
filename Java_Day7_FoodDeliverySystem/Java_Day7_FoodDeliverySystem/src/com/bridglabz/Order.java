package com.bridglabz;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
	enum payementMethod {COD, CREDIT_CARD, DEBIT_CARD, NETBANKING, UPI, WALLET};
	String deliveryAddress;
	String customerName;
	float totalPrice = 0;
	LocalDateTime orderTime;
	payementMethod method;
	Map<FoodItmes, Integer> map = new HashMap<FoodItmes, Integer>();
	
	@Override
	public String toString() {
		return "Order [deliveryAddress=" + deliveryAddress + ", customerName=" + customerName + ", totalPrice="
				+ totalPrice + ", orderTime=" + orderTime + ", method=" + method + ", map=" + map + "]";
	}
}
