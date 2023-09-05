package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.Maths;

public class TestMaths {
	
	private static Maths mat;
	
	@BeforeAll
	public static void init() {
		mat = new Maths();
	}
	
	@Test
	public void testSum() {
		assertEquals(20, mat.sum(10, 10));
	}
	
	@Test
	public void testDiv() {
		assertEquals(5, mat.div(10, 2));
	}
	
	@Test
	public void testDivision() {
		assertThrows(ArithmeticException.class,() -> { int x = 10 / 0;});
	}
	

}
