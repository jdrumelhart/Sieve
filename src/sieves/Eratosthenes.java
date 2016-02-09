package sieves;

import java.util.HashMap;

public class Eratosthenes extends Sieve {
	
	@Override
	public void primes(int l) {
		a = fillMap(l);
		for(int i = 2; i < Math.sqrt(l); i++) {
			if(a.get(i)) {
			//	for()
			}
		}
	}
	
	@Override
	public int getLastTime() {
		// TODO Auto-generated method stub
		return 0;
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