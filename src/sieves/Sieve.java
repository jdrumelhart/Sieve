package sieves;

import java.util.HashMap;

public interface Sieve {
	public static HashMap<Integer, Boolean> fillMap(int l) {
		HashMap<Integer, Boolean> f = new HashMap<Integer, Boolean>(l - 2);
		for(int i = 0; i < l - 2; i++) {
			f.put(i+2, true);
		}
		return f;
	}
	
	public HashMap<Integer, Boolean> primes(int l);
	public int getLastTime();
	public int getTimesRun();
	public int getLastMemory();
	public int getFastestTime();
}