package kontrollstrukturen01;

import java.util.Scanner;

public class Primzahl {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Bitte geben sie die zu ueberpruefende Zahl ein: ");

		long zahl = scanner.nextLong();
		
		boolean prim = true;
		
		for (int i=2 ; i<zahl/2 ; i++) {
			
			if(zahl%i==0) {prim=false; }
			
		}
		
		if(prim) {System.out.println(zahl+" ist eine Primzahl");}
		else {System.out.println(zahl+" ist keine Primzahl");}
		
	}

}
