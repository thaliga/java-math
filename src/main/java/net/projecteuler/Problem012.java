package net.projecteuler;

import common.Util;

/**
 * http://code.jasonbhill.com/sage/project-euler-problem-12/
 * <script type="text/x-mathjax-config">
  MathJax.Hub.Config({
    extensions: ["tex2jax.js"],
    jax: ["input/TeX", "output/HTML-CSS"],
    tex2jax: {
      inlineMath: [ ['$','$'], ["\\(","\\)"] ],
      displayMath: [ ['$$','$$'], ["\\[","\\]"] ],
      processEscapes: true
    },
    "HTML-CSS": { availableFonts: ["TeX"] }
  });
</script>
<script type="text/javascript" src="http://mathjax.jasonbhill.com/MathJax.js?config=TeX-AMS_HTML"></script>
<h3>Mathematics Behind a Solution</h3>
<p>If $T(n)$ is the n-th triangular number, then we know that</p>
<p>\[T(n)=1+2+\cdots+n=\sum_{i=1}^n=\frac{n(n+1)}{2}.\]</p>
<p>Let&#8217;s assume that we know the prime factorizations of both $n$ and $n+1$, and we&#8217;ll write</p>
<p>\[n = p_1^{e_1}p_2^{e_2}\cdots p_s^{e^s}\quad\text{and}\quad n+1 = q_1^{f_1}q_2^{f_2}\cdots q_t^{f_t}\]</p>
<p>Notice that $n$ and $n+1$ cannot share any prime factors (as they are consecutive numbers), and so we know that all the $p_i$ and $q_i$ are distinct primes. Also, one and only one of $n$ and $n+1$ are divisible by 2. The exponents $e_i$ and $f_i$ are therefore the only things we really need to consider in order to determine the number of divisors of $T(n)$. The fact that $T(n)=(n(n+1))/2$ means that we&#8217;ll need to neglect a single power of two in the factorization of $n$ or $n+1$ (remember, only one is even). Let&#8217;s assume, without loss of generality, that $n$ is even and that $p_1=2$. Then, some quick combinatorics tell us that the total number of factors of $T(n)$ will be</p>
<p>\[(e_1)(e_2+1)\cdots(e_s+1)(f_1+1)(f_2+1)\cdots(f_t+1)=e_1\prod_{i=2}^s(e_i+1)\prod_{i=1}^t(f_i+1)\]</p>
<p>Even better, as we&#8217;re increasing our triangular numbers looking for the first one to satisfy the property in question, we only need to calculate the factorization of $n+1$ (as we already know that factorization of $n$, as it was previously $n+1$). This should decrease the runtime substantially.</p>
 */
public class Problem012 {

	public static long solution() {
		long index = findTriangularIndex(500);
		return index * (index + 1) / 2;
	}

	private static long countDivisorsWrapper(long n) {
		if (n % 2 == 0) {
			n = n / 2;
		}
		return Util.countDivisors(n);
	}

	private static long findTriangularIndex(int factorLimit) {
		long n = 1;
		long lnum, rnum;
		lnum = countDivisorsWrapper(n);
		rnum = countDivisorsWrapper(n+1);
		while (lnum * rnum < factorLimit) {
			n += 1;
			lnum = rnum;
			rnum = countDivisorsWrapper(n + 1);
		}
		return n;
	}

	public static long solutionBruteforce() {
		return 0L;
	}
}
