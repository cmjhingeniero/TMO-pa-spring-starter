package com.galvanize.tmo.paspringstarter.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author CJarami8
 * 1. If the number is divisible by 3, return the string "Fizz"
 * 2. If the number is divisible by 5, return the string "Buzz"
 * 3. If the number is divisible by both 3 and 5, return the string "FizzBuzz"
 * 4. Otherwise, return the number as a string
 */

public class FizzbuzzTest {

	@Test
	void testFizzbuzz() {
		Fizzbuzz fizzBuzz = new Fizzbuzz();
		
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
		assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
		
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(20));
		
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(60));
		
		assertEquals("2", fizzBuzz.fizzBuzz(2));
		assertEquals("4", fizzBuzz.fizzBuzz(4));
		assertEquals("7", fizzBuzz.fizzBuzz(7));
	}
	
}
