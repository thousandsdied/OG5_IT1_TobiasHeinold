package eva;

import java.util.Scanner;

public class a1 {
	
	private static String text = "";
	
	static Scanner scanner = new Scanner(System.in);;
	
	public static void main(String[] args) {
	
	System.out.println("Bitte Wort eingeben");	
		
	try {
		 text = scanner.nextLine();
      } catch (Exception e){
    	  
      }
	
	
	
	text=text.replaceAll(" ", "");

	
	System.out.println(text.length());
	
	}
}
