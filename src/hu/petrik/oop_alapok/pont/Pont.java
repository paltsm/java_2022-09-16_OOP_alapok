package hu.petrik.oop_alapok.pont;

public class Pont {
	private int x;
	private int y;

	public Pont() {
		this.x = 0;
		this.y = 0;
	}

	public Pont(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Pont(int n) {
		this.x = koordinataGeneralasa(n);
		this.y = koordinataGeneralasa(n);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private static int koordinataGeneralasa(int n) {
		return (int) (Math.random() * (2 * n + 1)) - n;
	}

	public double getTavolsagOrigotol() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public double tavolsag(Pont masikPont) {
		return Math.sqrt(Math.pow(this.x - masikPont.x, 2) + Math.pow(this.y - masikPont.y, 2));
	}

	public String sikNegyed() {
		if (this.x < 0 && this.y > 0) {
			return "az 1. síknegyedben van";
		} else if (this.x > 0 && this.y > 0) {
			return "a 2. síknegyedben van";
		} else if (this.x > 0 && this.y < 0) {
			return "a 3. síknegyedben van";
		} else if (this.x < 0 && this.y < 0) {
			return "a 4. síknegyedben van";
		} else {
			return "az egyik tengelyen van ";
		}
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}
}
