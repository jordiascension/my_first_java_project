package com.sinensia.presentation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.substract(4, 2)==2);	
	}

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.add(4, 2)==6);
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.divide(4, 2)==2);
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.multiply(4, 2)==8);
	}

}
