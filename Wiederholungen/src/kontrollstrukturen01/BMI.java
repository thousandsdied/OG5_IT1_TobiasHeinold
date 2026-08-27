package kontrollstrukturen01;

import java.util.Scanner;

public class BMI {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Gewicht in kg: ");
		
		double gewicht = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Groesse in cm: ");
		
		double groesse = Double.parseDouble(scanner.nextLine());
		
		String geschlecht = "";
		
		boolean gueltig;
		
		System.out.println("Geschlecht (m/w): ");
		
		do {
			
			geschlecht = scanner.nextLine();
			
			if(geschlecht.equals("w") || geschlecht.equals("m")) {gueltig=true;}
			
			else {
				
				gueltig=false;
				
				System.out.println("Ungueltig. Bitte nochmal eingeben: ");
				
			}
			
		}while(!gueltig);

		double bmi=gewicht/Math.pow(groesse/100, 2);
		
		String klasse="";
		int m=0;
		if(geschlecht.equals("m")) {m=1;}
			
		if(bmi>24+m) {klasse="Uebergewicht";}
		else if(bmi<19+m) {klasse="Untergewicht";}
		else {klasse="Normalgewicht";}
			
		System.out.println("Ihr BMI beträgt "+bmi+" und ihre Klassifikation ist "+klasse);
		
	}

}
