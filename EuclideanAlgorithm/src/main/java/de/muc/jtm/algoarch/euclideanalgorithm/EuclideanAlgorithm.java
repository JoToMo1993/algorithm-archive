package de.muc.jtm.algoarch.euclideanalgorithm;

import org.apache.log4j.Logger;

public class EuclideanAlgorithm {
	private static final Logger LOGGER = Logger.getLogger(EuclideanAlgorithm.class);

	public static int gcdSubtraction(int a, int b) {
		LOGGER.info("Start gcdSubtraction(" + a + ", " + b + ")");
		
		int iterations = 0;
		
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
			iterations++;
		}
		
		LOGGER.info("It took " + iterations + " iterations, to calculate the greatest common divisor.");
		
		return a;
	}
	
	public static int gcdModulus(int a, int b) {
		LOGGER.info("Start gcdModulus(" + a + ", " + b + ")");
		
		int iterations = 0;
		
		int temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		
		LOGGER.info("It took " + iterations + " iterations, to calculate the greatest common divisor.");
		
		return a;
	}
}
