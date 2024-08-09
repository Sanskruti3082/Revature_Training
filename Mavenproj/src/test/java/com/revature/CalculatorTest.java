package com.revature;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import day6.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	
	@Test
	//@Disabled
	@DisplayName("Positive as to add two numbers")
	@Order(2)
	public void testSumPositive() {
		//Arrange
		Calculator calculator=new Calculator();
		int input1=10;
		int input2=10;
		int result=0;
		System.out.println("Positive");
		//Act
		result=calculator.sum(input1, input2);
		
		//Assert
		Assertions.assertEquals(20,result);
	}
	
	@Test
	@Order(1)
	public void testSumNegative() {
		//Arrange
		Calculator calculator=new Calculator();
		int input1=10;
		int input2=10;
		int result=0;
		System.out.println("Negative");
		//Act
		result=calculator.sum(input1, input2);
		
		//Assert
		Assertions.assertEquals(20,result);
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before Each");
	}
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After Each");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}


