package sieves;

import java.util.HashMap;

public abstract class Sieve {
	
	private int lastTime;
	private int fastTime;
	private int timesRun;
	public HashMap<Integer, Boolean> a;
	
	public static HashMap<Integer, Boolean> fillMap(int l) {
		HashMap<Integer, Boolean> f = new HashMap<Integer, Boolean>(l - 2);
		for(int i = 0; i < l - 2; i++) {
			f.put(i+2, true);
		}
		return f;
	}
	public Sieve() {
		lastTime = 0;
		fastTime = 0;
		timesRun = 0;
	}
	public abstract HashMap<Integer, Boolean> primes(int l);
	
	public int getLastTime() {
		return lastTime;
	}
	
	public int getTimesRun() {
		return timesRun;
	}
	
	public abstract int getLastMemory();

	public int getFastestTime() {
		return fastTime;
	}
}