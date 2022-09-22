package ül;

import java.util.Scanner;

public class KT1 {
  public static void main(String[] args) {
   Scanner i = new Scanner(System.in);
   System.out.println("Sisesta numbrid: ");
   double n1, n2, n3;
   n1 = i.nextDouble();
   n2 = i.nextDouble();
   n3 = n1 + n2;
   System.out.println("Vastus on " + n3);
  }
}