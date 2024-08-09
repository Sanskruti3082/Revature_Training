package com.revature;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import day6.Calculator;

public class CalculatorTest1 {

	static Calculator calculator=null;
	int input1=0;
	int input2=0;
	int result=0;
	
	@Test
	@DisplayName("Positive Case to add 2 numbers")
	@Order(2)
	public void testSumPositive() {
		
		result=calculator.sum(input1, input2);
		Assertions.assertEquals(20, result);
		
	}
	
	@Test
	@Order(1)
    public void testSumNegative() {
		
		result=calculator.sum(input1, input2);
		Assertions.assertEquals(10, result);
		
	}
	
	@BeforeEach
	public void beforeEach() {
		input1=10;
		input2=10;
	}
	
	@BeforeAll
	public void beforeAll() {
		calculator = new Calculator();
	}
	@AfterAll
	public void afterAll() {
		calculator=null;
	}
	
	
}
