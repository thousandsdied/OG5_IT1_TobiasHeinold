package dna;

import java.util.Scanner;

public class a5 {

	static Scanner scanner = new Scanner(System.in);
	private static String input="";
	
	public static void main(String[] args) {
		
		while(true) {
			String result="";
			
			try {
				
				input=scanner.nextLine();
				
			}catch(Exception e) {}
			
			for (char c : input.toCharArray()) {
				
				switch (c){
					
					case 'A': result+="T";
					break;
					case 'T': result+="A";
					break;
					case 'G': result+="C";
					break;
					case 'C': result+="G";
					
				}
				
			}
			
			System.out.print(result);
		}
	}
	
}
