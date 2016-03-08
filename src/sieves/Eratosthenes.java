package sieves;

import java.util.ArrayList;

public class Eratosthenes implements Sieve {	
	
	private int size = 0;
	
	public Eratosthenes() {
		size = 100;
	}
	
	public Eratosthenes(int size) {
		this.size = size;
	}
	@Override
	public ArrayList<Integer> primes() {
		ArrayList<Integer> a;
		a = Sieve.fillMap(size);
		for(int i = 2; i < Math.sqrt(size); i++) {
			if(a.contains(i)) {
				for(int j = i; j < i * i; j = j + i) {
					a.remove(j);
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