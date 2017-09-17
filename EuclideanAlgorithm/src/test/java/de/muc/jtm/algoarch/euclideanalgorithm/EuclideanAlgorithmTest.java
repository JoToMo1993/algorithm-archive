package de.muc.jtm.algoarch.euclideanalgorithm;

import static de.muc.jtm.algoarch.euclideanalgorithm.EuclideanAlgorithm.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EuclideanAlgorithmTest {

	@Test
	public void testSameNumbers() {
		for (int i = 12; i < 30; i++) {
			assertEquals(i, gcdSubtraction(i, i));
			assertEquals(i, gcdModulus(i, i));
		}
	}
	
	@Test
	public void testABiggerB() {
		for (int i = 12; i < 30; i++) {
			assertEquals(i, gcdSubtraction(i, i*2));
			assertEquals(i, gcdModulus(i, i*2));
		}
	}
	
	@Test
	public void testBBiggerA() {
		for (int i = 12; i < 30; i++) {
			assertEquals(i, gcdSubtraction(i*2, i));
			assertEquals(i, gcdModulus(i*2, i));
		}
	}
	
	private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
	
	@Test
	public void testPrimes() {
		for (int prime1 : primes) {
			for (int prime2 : primes) {
				if (prime1 != prime2) {
					assertEquals(1, gcdSubtraction(prime1, prime2));
					assertEquals(1, gcdModulus(prime1, prime2));
				} else {
					assertEquals(prime1, gcdSubtraction(prime1, prime2));
					assertEquals(prime1, gcdModulus(prime1, prime2));
				}
			}
		}
	}
}
