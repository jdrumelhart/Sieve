package sieves;

import java.util.HashMap;

public class Eratosthenes implements Sieve {	
	
	private int size = 0;
	
	public Eratosthenes() {
		size = 100;
	}
	
	public Eratosthenes(int size) {
		this.size = size;
	}
	@Override
	public HashMap<Integer, Boolean> primes() {
		HashMap<Integer, Boolean> a;
		a = Sieve.fillMap(size);
		for(int i = 2; i < Math.sqrt(size); i++) {
			if(a.get(i)) {
				for(int j = i; j < i * i; j = j + i) {
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