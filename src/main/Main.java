package main;

import java.util.HashMap;

import sieves.*;

public class Main {
	public static void main(String[] args) {
		Eratosthenes e = new Eratosthenes();
		HashMap<Integer,Boolean> emap = e.primes();
		
	}
}
