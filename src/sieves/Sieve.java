package sieves;

import java.util.ArrayList;
public interface Sieve {
	public static ArrayList<Integer> fillMap(int l) {
		ArrayList<Integer> f = new ArrayList<Integer>(l - 2);
		for(int i = 0; i < l - 2; i++) {
			f.add(i+2);
		}
		return f;
	}
	
	public ArrayList<Integer> primes();
	public int getLastTime();
	public int getTimesRun();
	public int getLastMemory();
	public int getFastestTime();
}