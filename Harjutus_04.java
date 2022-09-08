//Peedu Erik Pajo IT21


package ül;
import java.util.Scanner;

public class Harjutus_04 {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner (System.in); 
		System.out.print("Kirjuta lause: "); 
		String lause = scanner.nextLine();
		System.out.println(lause.toUpperCase());
		System.out.println(lause.length());
		int wordCount = 2;

	for (int i = 0; i < lause.length(); i++) {
		if (lause.charAt(i) == ' ') 
		{
         wordCount++;
		} 
	}

	System.out.println("Sõnu kokku on " + wordCount);
 
	String[] kiri;
	kiri = lause.split(" ");
 
	System.out.printf("Esimene sona tekstis on %s",kiri);
	}
}
 
 
 