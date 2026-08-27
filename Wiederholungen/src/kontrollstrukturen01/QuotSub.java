package kontrollstrukturen01;

import java.util.Scanner;

public class QuotSub {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Divident: ");
		
		int divident=Integer.parseInt(scanner.nextLine());

		System.out.print("Divisor: ");
		
		int divisor=Integer.parseInt(scanner.nextLine());
		
		int quotient=0;
		
		while(divident>=divisor) {
			
			divident-=divisor;
			
			quotient+=1;
			
		}
		
		System.out.println("Ganzahler Quotient: "+quotient);
		System.out.println("Ganzzahliger Rest: "+divident);
	}

}
