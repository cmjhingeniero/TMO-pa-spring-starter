package com.galvanize.tmo.paspringstarter.tdd;

public class Fizzbuzz {

	public String fizzBuzz(int x) {
		if ((x % 3 == 0) && (x % 5 == 0)) {
			return "FizzBuzz";
		} 
		else if (x % 3 == 0) {
			return "Fizz";
		} 
		else if (x % 5 == 0) {
			return "Buzz";
		} 
		return String.valueOf(x);
	}

}
