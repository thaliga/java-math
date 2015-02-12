package common;

import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Util {

	public static final double SQRT_5 = sqrt(5);

	public static final double FI = (1 + SQRT_5) / 2;

	public static final double LN_FI = log(FI);

	public static long factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int findFibonacciIndex(long n) {
		double d = n * SQRT_5 + 0.5;
		double log = log(d) / LN_FI;
		return (int) floor(log);
	}

	public static long findFibonacciNumber(int n) {
		double d = pow(FI, n) / SQRT_5 + 0.5;
		return (int) floor(d);
	}

	public static int getInt(char c) {
		return c - '0';
	}

	public static long lkkt(long a, long b) {
		return a * b / lnko(a, b);
	}

	public static long lnko(long a, long b) {
		// http://hu.wikipedia.org/wiki/Euklideszi_algoritmus
		long divident = a;
		long divider = b;
		long modulo = divident % divider;
		while (modulo != 0) {
			divident = divider;
			divider = modulo;
			modulo = divident % divider;
		}
		return divider;
	}

	private static boolean notDigit(char c) {
		return c < '0' || c > '9';
	}

	public static long sumFibonacciNumbers(int n) {
		return findFibonacciNumber(n + 2) - 1;
	}

	public static long sumOfDigits(BigInteger number) {
		char[] digits = number.toString().toCharArray();
		long result = 0L;
		int length = digits.length;
		System.out.println("length of BigInteger is " + length + ", "
				+ number.toString());
		int startFrom = 0;
		if (notDigit(digits[0])) {
			startFrom = 1;
		}
		for (int i = startFrom; i < length; ++i) {
			result += getInt(digits[i]);
		}
		return result;
	}

	public static long triangleNumber(long n) {
		return n * (n + 1) / 2;
	}

	public static long pentagonalNumber(long n) {
		return n * (3 * n - 1) / 2;
	}

	public static boolean isPentagonal(long p) {
		double d = 24 * p + 1;
		double n = (1 + Math.sqrt(d)) / 6;
		return n == floor(n);
	}

	public static long hexagonalNumber(long n) {
		return n * (2 * n - 1);
	}

	public static long countDivisors(long n) {
		long divisors = 1;
		int count = 0;
		while (n % 2 == 0) {
			count += 1;
			n = n / 2;
		}
		divisors = divisors * (count + 1);
		
		int p = 3;
		while (n != 1) {
			count = 0;
			while (n % p == 0) {
				count += 1;
				n = n / p;
			}
			divisors = divisors * (count + 1);
			p += 2;
		}
		return divisors;
	}

	public static InputStream loadResource(Class<?> clazz, String path) {
		ClassLoader classLoader = clazz.getClassLoader();
		try {
			File file = new File(classLoader.getResource(path).getFile());
			return new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<Long> convertToNumbers(String line) {
		ArrayList<Long> result = new ArrayList<Long>();
		Scanner scanner = new Scanner(line);
		while (scanner.hasNextLong()) {
			result.add(scanner.nextLong());
		}
		scanner.close();
		return result;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}

	public static int[] convertToArray(Collection<Integer> list) {
		int size = list.size();
		int[] result = new int[size];
		int i = 0;
		for (int prime : list) {
			result[i++] = prime;
		}
		return result;
	}
}
