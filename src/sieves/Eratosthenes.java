package sieves;

import java.util.HashMap;

public class Eratosthenes implements Sieve {	
	
	private int length = 0;
	private long lastTime;
	private static int timesRun;
	
	public Eratosthenes() {
		length = 100;
	}
	
	public Eratosthenes(int size) {
		length = size;
	}
	
	/**
	 * Finds all of the primes in a set from 2 to length
	 */
	@Override
	public HashMap<Integer, Boolean> primes() {
		long startTime = System.nanoTime();
		HashMap<Integer, Boolean> a = Sieve.fillMap(length);
		for(int i = 2; i < (int)Math.sqrt(length); i++) {
			if(a.get(i)) {
				for(int j = i * i; j < length; j += i) {
					a.put(j, false);
				}
			}
		}
		timesRun++;
		long endTime = System.nanoTime();
		lastTime = endTime - startTime;
		lastTime = lastTime /= 1000000.0;
		return a;
	}

	public static int getTimesRun() {
		return timesRun;
	}

	@Override
	public long getLastTime() {
		return lastTime; //In milliseconds
	}
}