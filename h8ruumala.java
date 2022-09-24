//Peedu Erik Pajo IT21
package ül;

public class h8ruumala {

	public static double kuup(String a) {
		float pikkus = Float.parseFloat(a);
		double s = pikkus * pikkus * pikkus;
		return s;
	}
	
	public static double risttahukas(String l, String h,String w) {
		float pikkus = Float.parseFloat(l);
		float korgus = Float.parseFloat(h);
		float laius = Float.parseFloat(w);
		double s = laius * korgus * pikkus;
		return s;
	}
	

}
