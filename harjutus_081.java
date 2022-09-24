//Peedu Erik Pajo IT21
package ül;
import java.util.Scanner;

public class harjutus_081 {
	

public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("(1)Kuubi pindala (2) Risttahuka pindala (3) Risttahuka ruumala (4) Kuubi ruumala \nVali number 1st-4ni: "); 
		String valik = scanner.next();
		String pikkus;
		String laius;
		String korgus;
		
		double s;
		
		switch (Integer.parseInt(valik)) {
		case 1:
			System.out.print("Sisesta pikkus: ");
			pikkus = scanner.next();
			s = h8pindala.kuup(pikkus, pikkus);
			System.out.print("Kuubi pindala on "+s);
			break;
		case 2:
			System.out.print("Sisesta pikkus: ");
			pikkus = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			System.out.print("Sisesta laius: ");
			laius = scanner.next();
			s = h8pindala.risttahukas(pikkus, korgus, laius);
			System.out.print("Risttahuka pindala on "+s);
			break;
		case 3:
			System.out.print("Sisesta pikkus: ");
			pikkus = scanner.next();
			System.out.print("Sisesta laius: ");
			laius = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			s = h8ruumala.risttahukas(pikkus, korgus, laius);
			System.out.print("Risttahuka ruumala on "+s);
			break;
		case 4:
			System.out.print("Sisesta pikkus: ");
			pikkus = scanner.next();
			s = h8ruumala.kuup(pikkus);
			System.out.print("Kuubi ruumala on "+s);
			break;

		
		}

	}
}
