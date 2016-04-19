package main;


import org.jfree.data.xy.XYSeries;

import sieves.*;

public class Main {
	public static void main(String[] args) {
		long[][] a = new long[10][10];
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				Eratosthenes e = new Eratosthenes(1000000);
				a[j][i] = e.getLastTime();
			}
		}
	}
}
