package sieves;

import java.util.HashMap;

public class Eratosthenes extends Sieve {
	
	public Eratosthenes() {
		super();
	}
	@Override
	public HashMap<Integer, Boolean> primes(int l) {
		a = fillMap(l);
		for(int i = 2; i < Math.sqrt(l); i++) {
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
}