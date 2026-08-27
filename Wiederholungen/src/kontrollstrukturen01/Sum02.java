package kontrollstrukturen01;

import java.util.Scanner;

public class Sum02 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Grenzwert eingeben: ");
		
		int grenzwert = scanner.nextInt();
		
		int endwert=0;
		
		for (int i = 0; i<grenzwert ; i++) {
			
			endwert+=2*grenzwert;
			
		}

		System.out.println("Der Endwert beträgt "+endwert);
		
	}

}
