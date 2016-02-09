package sieves;

import java.util.HashMap;

public abstract class Sieve {
	
	public HashMap<Integer, Boolean> a;
	
	public static HashMap<Integer, Boolean> fillMap(int l) {
		HashMap<Integer, Boolean> f = new HashMap<Integer, Boolean>(l - 2);
		for(int i = 0; i < l - 2; i++) {
			f.put(i+2, true);
		}
		return f;
	}
	
	public abstract void primes(int l);
	
	public abstract int getLastTime();
	
	public abstract int getTimesRun();
	
	public abstract int getLastMemory();
}