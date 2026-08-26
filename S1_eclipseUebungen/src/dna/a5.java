package dna;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a5 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static String input="";
	
	public static void main(String[] args) {
		
		while(true) {
			String result="";
			
			try {
				
				input=br.readLine();
				
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
