package com.bridglabz.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumTest <t> {
	TestMaximum testInt = new TestMaximum(0.2,0.23,1.44);
	TestMaximum testStr = new TestMaximum("dfgh","cvxh","adghjha");
	
	@Test      
	void testGetMaximumNumber() {
		t maxInt = (t) testInt.maximum();
		assertEquals(1.44, maxInt);
		t maxStr = (t) testStr.maximum();
		assertEquals("adghjha",maxStr);
	
	}
}
