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
		System.out.printf("a %s pont távolsága az origótol %.3f\n", p3, p3.getTavolsagOrigotol());
		System.out.printf("a %s pont távolsága a %s ponttól %.3f\n", p2, p3, p2.tavolsag(p3));

		Pont[] pontok = new Pont[100];
		for (int i = 0; i < pontok.length; i++) {
			pontok[i] = new Pont(15);
		}
		for (Pont p:pontok) {
			System.out.println(p);
		}

		int legtavolabb_index=0;
		for (int i = 0; i < pontok.length; i++) {
			if (pontok[legtavolabb_index].getTavolsagOrigotol() < pontok[i].getTavolsagOrigotol()){
				legtavolabb_index = i;
			}
		}
		System.out.printf("az origótol legtávolabb a(z) %d. áll." + " a pont a(z): %s, távolsága az origótol: %.3f\n", (legtavolabb_index+1),pontok[legtavolabb_index],pontok[legtavolabb_index].getTavolsagOrigotol());
		System.out.printf("a pont a %d. síknegyedben van",p2.sikNegyed());
	}
}
