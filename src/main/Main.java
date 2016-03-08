package main;

import java.util.ArrayList;
import sieves.*;

public class Main {
	public static void main(String[] args) {
		Eratosthenes e = new Eratosthenes();
		ArrayList<Integer> emap = e.primes();
		Sundaram s = new Sundaram();
		ArrayList<Integer> smap = s.primes();
		System.out.println(emap.equals(smap));
	}
}
