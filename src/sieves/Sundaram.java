package sieves;

import java.util.HashMap;

public class Sundaram implements Sieve {

	private int size = 0;
	
	public Sundaram() {
		size = 100;
	}
	
	public Sundaram(int size) {
		this.size = size;
	}
	
	@Override
	public HashMap<Integer, Boolean> primes() {
		HashMap<Integer, Boolean> a;
		a = Sieve.fillMap(size);
		int i = 0;
		int j = 0;
		boolean lastI = false;
		while(i <= size && j <= size && (i + j + 2*i*j) <= size) {
			while(a.remove(i + j + 2*i*j));
			if(lastI) {
				j++;
				lastI = true;
			}
			else {
				i++;
				lastI = false;
			}
		}
		return;
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

	@Override
	public int getFastestTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}