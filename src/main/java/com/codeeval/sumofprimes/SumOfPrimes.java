package com.codeeval.sumofprimes;

import common.Util;

public class SumOfPrimes {

	public long calculate(int numberOfPrimes) {
		if (numberOfPrimes < 0) {
			throw new IllegalArgumentException();
		}
		int[] primes = Util.Prime.primes(numberOfPrimes);
		long sum = 0;
		for (int i = 0; i < numberOfPrimes; ++i) {
			sum += primes[i];
		}
		return sum;
	}
}
