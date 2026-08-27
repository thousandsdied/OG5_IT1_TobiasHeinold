package kontrollstrukturen01;
import java.util.Scanner;

public class Groﬂhaendler01 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int maus;
		double einzelpreis,gesamtpreis;
		
		System.out.print("Bitte Anzahl der M‰use eingeben: ");
		
		 maus = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Bitte Einzelpreis eingeben: ");
		
		einzelpreis = Double.parseDouble(scanner.nextLine());
		
		gesamtpreis=maus*einzelpreis*1.19;
		
		if(maus<10) {
			
			gesamtpreis+=10;
			
		}
		
		System.out.println("Der Gesamtpreis betr‰gt "+gesamtpreis);

	}

}
