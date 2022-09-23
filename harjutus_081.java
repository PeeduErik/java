package ül;
import java.util.Scanner;

public class harjutus_081 {
	

public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("(1)kuupi pindala (2) Ristküliku pindala (3) Ristküliku ruumala (4) kuupi ruumala \nVali tegevus: "); 
		String valik = scanner.next();
		String alus;
		String korgus;
		String pikkus;
		
		double s;
		
		switch (Integer.parseInt(valik)) {
		case 1:
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			s = h8pindala.kuup(alus, korgus);
			System.out.printf("kuup pindala on "+s);
			break;
		case 2:
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			s = h8pindala.ristkylikS(alus, korgus);
			System.out.printf("Ristküliku pindala on "+s);
			break;
		case 3:
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
			s = h8ruumala.kuup(alus);
			System.out.printf("Ristküliku pindala on "+s);
			break;
		case 4:
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
			System.out.print("Sisesta korgus: ");
			korgus = scanner.next();
			System.out.print("Sisesta pikkus: ");
			pikkus = scanner.next();
			s = h8ruumala.ristkylikS(alus,korgus,pikkus);
			System.out.printf("Ristküliku pindala on "+s);
			break;

		default:
			System.out.print("Ei tööta");
			break;
		}

	}
}