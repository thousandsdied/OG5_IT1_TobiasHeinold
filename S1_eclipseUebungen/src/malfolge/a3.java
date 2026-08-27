package malfolge;

import java.util.Scanner;

public class a3 {

	static Scanner scanner = new Scanner(System.in);
	
	private static int zahl = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Malfolge? ");
		
		try {
			
			zahl=scanner.nextInt();
			
		}catch(Exception e) {}
		
	
		for (int i = 0 ; i<=10 ; i++) {
			
			System.out.println(i + " * " + zahl + " = " + zahl*i);
			
		}
	
	}
	
}
