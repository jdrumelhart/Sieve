package sieves;

import java.util.ArrayList;
import java.util.HashMap;
public interface Sieve {
	public static HashMap<Integer, Boolean> fillMap(int l) {
		HashMap<Integer, Boolean> f = new HashMap<Integer, Boolean>(l - 2);
		for(int i = 2; i < l + 1; i++) {
			f.put(i, true);
		}
		return f;
	}
	
	public HashMap<Integer, Boolean> primes();
	public int getLastTime();
	public int getTimesRun();
	public int getLastMemory();
	public int getFastestTime();
}