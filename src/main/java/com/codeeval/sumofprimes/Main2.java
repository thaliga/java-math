package com.codeeval.sumofprimes; // to be deleted

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class Main2 {

	public static void main(String[] args) {
		long sumOfPrimes = sumOfPrimes(1000);
		System.out.println(sumOfPrimes);
	}

	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n < 4) {
			return true; // 2 and 3 are prime
		}
		if (n % 2 == 0) {
			return false;
		}
		if (n < 9) {
			return true; // we have already excluded 4,6 and 8.
		}
		if (n % 3 == 0) {
			return false;
		}
		int r = (int) floor(sqrt(n));
		int f = 5;
		while (f <= r) {
			if (n % f == 0) {
				return false;
			}
			if (n % (f + 2) == 0) {
				return false;
			}
			f = f + 6;
		}
		return true;
	}

	private static long sumOfPrimes(int numberOfPrimes) {
		if (numberOfPrimes <= 0) {
			throw new IllegalArgumentException();
		}
		int count = 1;
		long result = 2;
		for (int number = 3; count < numberOfPrimes; number += 2) {
			if (isPrime(number)) {
				count++;
				result += number;
			}
		}
		return result;
	}
}
