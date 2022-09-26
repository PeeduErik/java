package ül;

public class KT5kooru {

	public static double jes(String a, String b, String c, String d, String e, String f) {
		float arv1 = Float.parseFloat(a);
		float arv2 = Float.parseFloat(b);
		float arv3 = Float.parseFloat(c);
		float arv4 = Float.parseFloat(d);
		float arv5 = Float.parseFloat(e);
		float arv6 = Float.parseFloat(f);
		double s = (arv1+arv2+arv3+arv4)+(arv5 * arv6/(arv5+arv6));
		return s;
	}
}
	