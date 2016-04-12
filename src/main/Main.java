package main;

import java.util.ArrayList;
import java.util.HashMap;

import sieves.*;

public class Main {
	public static void main(String[] args) {
		Eratosthenes e = new Eratosthenes();
		HashMap<Integer, Boolean> emap = e.primes();
//		Sundaram s = new Sundaram();
//		ArrayList<Integer> smap = s.primes();
//		System.out.println(emap.equals(smap) + " " + emap.size() + " " + smap.size());
		for(int i = 2; i < emap.size(); i++) {
			if(emap.get(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
