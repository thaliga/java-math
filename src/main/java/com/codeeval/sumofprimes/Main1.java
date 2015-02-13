package com.codeeval.sumofprimes; // to be deleted

import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	
	public static void main(String[] args) {
		long sumOfPrimes = sumOfPrimes(1000);
		System.out.println(sumOfPrimes);
	}

	private static List<Integer> primes;

	private static boolean isPrime(int number) {
		int limit = (int) sqrt(number);
		for (int prime : primes) {
			if (prime > limit) {
				break;
			}
			if (number % prime == 0) {
				return false;
			}
		}
		return true;
	}

	private static long sumOfPrimes(int numberOfPrimes) {
		if (numberOfPrimes <= 0) {
			throw new IllegalArgumentException();
		}
		primes = new ArrayList<Integer>();
		primes.add(2);
		long result = 2;
		for (int number = 3; !(primes.size() >= numberOfPrimes); number += 2) {
			if (isPrime(number)) {
				primes.add(number);
				result += number;
			}
		}
		return result;
	}
}
