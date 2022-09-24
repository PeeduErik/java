//Peedu Erik Pajo IT21
package ül;

import java.util.Scanner;

public class harjutus_05{
	
	public static void main(String[] args) {
	
		jagamine(0);
	}
	
	public static void jagamine(int i) {
	int k = 0;
		
	while (k > 3); {
	Scanner scanner= new Scanner (System.in);
	System.out.println("Sisesta arv: ");
	int arv1 = scanner.nextInt();
	System.out.println("Sisesta arv: ");
	int arv2 = scanner.nextInt();

	if (arv1 >= 0 && arv2 > 0) {
		double vastus = arv1 / arv2;
		System.out.println("Vastus on "+vastus);
		k++;
	}
	else {
		System.out.println("Negatiivseid arve ei tohi kasutada");
	
	}
	
		
	}

}
}

