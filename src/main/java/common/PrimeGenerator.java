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

	private PrimeChecker checker = getChecker();

	private int[] result;

	private List<Integer> primes;

	protected PrimeChecker createChecker() {
		return new DefaultChecker();
	}

	public final int[] generate() {
		if (result == null) {
			primes = new ArrayList<Integer>();
			primes.add(2);

			for (int number = 3; !stopCondition(number); number += 2) {
				if (checker.isPrime(number)) {
					primes.add(number);
				}
			}

			result = Util.convertToArray(primes);
		}
		return result;
	}

	final PrimeChecker getChecker() {
		if (checker == null) {
			checker = createChecker();
		}
		return checker;
	}

	final protected List<Integer> getPrimes() {
		return primes;
	}

	abstract protected boolean stopCondition(int number);
}