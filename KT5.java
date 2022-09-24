//Peedu Erik Pajo IT21
package ül;
import java.util.Scanner;
public class KT5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Sisesta arv: ");
		int arv1 = scanner.nextInt();
		System.out.println("Sisesta arv: ");
		int arv2 = scanner.nextInt();
		System.out.println("Sisesta arv: ");
		int arv3 = scanner.nextInt();
		System.out.println("Sisesta arv: ");
		int arv4 = scanner.nextInt();
		System.out.println("Sisesta arv: ");
		int arv5 = scanner.nextInt();
		System.out.println("Sisesta arv: ");
		int arv6 = scanner.nextInt();
		double jada = arv1+arv2+arv3+arv4;
		double roop = arv5 * arv6/(arv5+arv6);
		double kokku = jada+roop;
		System.out.println("Kogutakistus on "+kokku);
		
		
}
}	
