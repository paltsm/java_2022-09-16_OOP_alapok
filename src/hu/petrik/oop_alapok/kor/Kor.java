package hu.petrik.oop_alapok.kor;

public class Kor {

	//	+ Készítsen egy kört reprezentáló osztályt. Lehessen inicializálni a középpont koordinátáinak és a sugárnak a
//	  megadásával, valamint csak a sugár megadásával (ilyenkor origó középpontú), valamint véletlenszerűen.
//	+ Határozza meg a Kör kerületét.
//	+ Határozza meg a Kör területét.
//	+ Készítsen metódust, amelynek a segítségével egy kört lehet nagyítani, vagy kicsinyíteni.
//	+ Lehessen megkapni a kör adatait egy stringben (x,y,r) alakban.
//	+ Teszteléshez hozzon létre 10 példányt az osztályból, és írja ki őket a képernyőre.
//	+ Készítsen programot, ami megkeresi a legnagyobb területtel rendelkező kört.
	private int x;
	private int y;
	private int r;

	public Kor(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Kor(int r) {
		this.x = 0;
		this.y = 0;
	}

	public Kor() {
		this.x = koordinataGeneralasa();
		this.y = koordinataGeneralasa();
		this.r = sugarGeneralasa();
	}

	public double Kerulet() {
		return 2 * r * Math.PI;
	}

	public double Terulet() {
		return r * r * Math.PI;
	}

	public String Meret(int n) {
		if (this.r + n > 0) {
			this.r += n;
			return toString();
		} else {
			return "a megadott méret változtatás nem jó";
		}
	}

	private static int koordinataGeneralasa() {
		return (int) (Math.random() * (2 * 50 + 1)) - 50;
	}

	private static int sugarGeneralasa() {
		return (int) (Math.random() * (2 * 25) + 1);
	}

	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.x, this.y, this.r);
	}
}
