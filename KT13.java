package ül;
import java.util.Scanner;
public class KT13 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Mitme realist kolmnurka soovid?");
 
        int rows = sc.nextInt();
 
        System.out.println("Siin on sinu kolmnurk");
 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= 2*i-1; j++)
            {
                if (i == j)
                {
                    System.out.print(i);
                } 
                else
                {
                    System.out.print("*");
                }
            }
 
            System.out.println();
        }
 
       
 
        sc.close();
    }
}


