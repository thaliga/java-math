package common;

import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.List;

abstract class PrimeGenerator {

	class DefaultChecker implements PrimeChecker {
		@Override
		public boolean isPrime(int number) {
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
	}

	private PrimeChecker checker = this.new DefaultChecker();

	private int[] result;

	protected List<Integer> primes;

	public final int[] generate() {
		if (result == null) {
			primes = new ArrayList<Integer>();
			primes.add(2);

			for (int number = 3; !stopCondition(number); number += 2) {
				if (checker.isPrime(number)) {
					primes.add(number);
				}
			}

			result = Util.toArray(primes);
		}
		return result;
	}

	abstract protected boolean stopCondition(int number);

	protected void setChecker(PrimeChecker checker) {
		this.checker = checker;
	}
}