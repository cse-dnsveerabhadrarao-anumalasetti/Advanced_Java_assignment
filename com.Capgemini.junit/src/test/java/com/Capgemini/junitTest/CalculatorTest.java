package com.Capgemini.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.Capgemini.junit.Calculator;

public class CalculatorTest {
	private Calculator calculator;
//	Calculator calculator = new Calculator();
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	@DisplayName("Test of two positive numbers")
	public void testTwoAndTwoFour() {
		assertEquals(4,calculator.add(2,2));
	}
	
	@Test
	public void testTwoAndTwoFour1() {
		assertEquals(9,calculator.add(5,4));
	}
	
	@RepeatedTest(3)
	@DisplayName("Test sum of two repeated execution")
	void testSumRepeated() {
		assertEquals(10,calculator.sum(5,5),"Sum of 5 and 5 gives 10");
	}
	
	@Nested
	@DisplayName("Subtraction Tests")
	class SubtractionTest {
		
		@Test
		@DisplayName("Test Subtraction of two numbers")
		void testSubtraction1() {
			assertEquals(1,calculator.sub(5,4), "5 - 4 should returns 1");
		}
		
		@Test
		void testSubtraction() {
			assertEquals(0,calculator.sub(1,1), "1 - 1 should returns 0");
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5,6})
	@DisplayName("Test multiplication of numbers by 2")
	void testmultiplication(int number) {
		assertEquals(number * 2,calculator.multiply(number,2), "multiplication of two numbers");
	}
	
	@ParameterizedTest
	@CsvSource({"2,2,4","2,3,6","4,4,16"})
	@DisplayName("Test multiplication of numbers by 2")
	void testmultiplication(int x,int y, int expected) {
		assertEquals(expected, calculator.multiply(x, y));
	}
	
	
	@ParameterizedTest
	@CsvFileSource(resources = "/calculator.data.csv", numLinesToSkip = 1)
	@DisplayName("Test multiplication of numbers by 2")
	void testSumUsingCsvFile(int a,int b, int expectedSum) {
		assertEquals(expectedSum, calculator.multiply(a, b));
	}
	
}
