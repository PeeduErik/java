package ül;

public class harjutus_082 {
	 
	 public String nimi;
	 public int pikkus;
	 public int kaal;
	 
	 public void sookoll(String a, int b, int c){
	 this.nimi = a;
	 this.pikkus = b;
	 this.kaal = c;
	 }
	 
	 public void sookoll(){
	 this.nimi = "Shrek";
	 this.pikkus = 300;
	 this.kaal =130;
	 }
	 
	 public void ID(){
	 System.out.println("Sookolli nimi on "+nimi+", ta on"+pikkus+"cm pikk, ja ta kaalub "+kaal+"kg");
	 }
	}