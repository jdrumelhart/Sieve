package sieves;

import java.util.ArrayList;
import java.util.HashMap;

public class Eratosthenes implements Sieve {	
	
	private int length = 0;
	
	public Eratosthenes() {
		length = 100;
	}
	
	public Eratosthenes(int size) {
		length = size;
	}
	@Override
	public HashMap<Integer, Boolean> primes() {
		HashMap<Integer, Boolean> a = Sieve.fillMap(length);
		for(int i = 2; i < (int)Math.sqrt(length); i++) {
			if(a.get(i)) {
				for(int j = i * i; j < length; j += i) {
					a.put(j, false);
				}
			}
		}
		return a;
	}

	@Override
	public int getTimesRun() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLastMemory() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getLastTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFastestTime() {
		// TODO Auto-generated method stub
		return 0;
	}
}