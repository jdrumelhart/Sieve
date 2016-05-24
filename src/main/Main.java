package main;


import java.util.ArrayList;

import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

import sieves.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Double> mag = new ArrayList<Double>();
		for(int i = 10; i < 100; i = i*10) {
			mag.add(runTimes(i, 100));
		}
	}
	
	/**
	 * A method for running a set of Sieves of Eratosthenes of a particular size
	 * and averaging their run time
	 * @param size The size of the set the Sieve is running over
	 * @param reps The number of repetitions 
	 * @return The average time for a single Sieve of size size.
	 */
	public static double runTimes(int size, double reps) {
		double sum = 0;
		for(int j = 0; j < reps; j++) {
			Eratosthenes e = new Eratosthenes(size);
			e.primes();
			sum += e.getLastTime();
		}
		sum = sum / reps;
		return sum;
	}
}
