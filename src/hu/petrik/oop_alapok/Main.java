package hu.petrik.oop_alapok;

import hu.petrik.oop_alapok.pont.Pont;

public class Main {
	public static void main(String[] args) {
		Pont p1 = new Pont();
		Pont p2 = new Pont(3,6);
		Pont p3 = new Pont(100);


		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
