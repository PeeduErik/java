package ül;

public class h8pindala {

	public static double kuup(String a, String h) {
		float pikkus = Float.parseFloat(a);
		double s = 6 * (pikkus * pikkus);
		return s;
	}
	
	public static double risttahukas(String a, String h, String o) {
		float pikkus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		float laius = Float.parseFloat(o);
		double s = 2*(pikkus*laius+laius*korgus+pikkus*korgus);
		return s;
	}
	

}
