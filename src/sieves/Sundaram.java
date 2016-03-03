package sieves;

import java.util.ArrayList;
public class Sundaram implements Sieve {

	private int size = 0;
	
	public Sundaram() {
		size = 100;
	}
	
	public Sundaram(int size) {
		this.size = size;
	}
	
	@Override
	public ArrayList<Integer> primes() {
		int internalSize = size / 2 + 2;
		ArrayList<Integer> a;
		a = Sieve.fillMap(internalSize);
		int i = 0;
		int j = 0;
		boolean lastI = false;
		while(i <= size && j <= internalSize && (i + j + 2*i*j) <= internalSize) {
			while(a.remove(new Integer(i + j + 2*i*j)));
			if(lastI) {
				j++;
				lastI = true;
			}
			else {
				i++;
				lastI = false;
			}
		}
		for(Integer o:a) {
			a.remove(o);
			a.add(new Integer(o.intValue() * 2 + 1));
		}
		return a;
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