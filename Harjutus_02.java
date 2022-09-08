//Peedu Erik Pajo IT21

package ül;

public class Harjutus_02 {
	   public static void main(String[] args) {
		    elips(1,2);
		    minut(69420);
		    kiirus(10);
		        double x,z;
		        
		        x = Math.round(Math.random()*100);
		        z = (x*0.0254);
		         System.out.println(x+ "tolli on "+z+"m");
		         }


		    static void elips(int x, int y) {
		        
		        double pindala = Math.PI*x*y;
		        System.out.println("Elipsi pindala on "+ pindala);
		    }


		    static void minut(int x){

		        int tund = (x/60);
		        int min = (x%60);
		        System.out.println("");
		        System.out.printf("%d:%02d", tund, min);
		        System.out.println("");
		    }

		    static void kiirus(int km){
		        double aeg = Math.round(Math.random()*120);
		        double aeg1 = Math.round(Math.random()*120);

		        double kiirus = km/(aeg /60);
		        double kiirus1 = km/(aeg1 /60);
		        System.out.println("Esimese jooksja kiirus on: "+Math.round(Math.abs(kiirus))+" km/h");
		        System.out.println("Teise jooksja kiirus on: "+Math.round(Math.abs(kiirus1))+" km/h");
		        System.out.println(aeg);
		        
		        kiirus_erinevus(kiirus, kiirus1);
		    
		    
		    
		    }   
		    static void kiirus_erinevus(double y, double q){
		        int y1 = (int) y;
		        int q1 = (int) q;
		        int erinevus;
		        if (y1 > q1){
		            erinevus = (y1-q1);
		            System.out.println("Esimene jooksja on "+Math.round(erinevus)+ " km/h kiirem");
		        
		        }else{
		            erinevus = (q1 - y1);
		            System.out.println("Teine jooksja on "+Math.round(erinevus)+ " km/h kiirem");
		    }
		       }

}
