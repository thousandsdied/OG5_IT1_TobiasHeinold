package mensa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a2 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static float pom=0f;
	private static float dur=0f;
	private static float total=0f;
	
	public static void main(String[] args) {
		
		System.out.print("Anzal der Pommesportionen: ");
		
		try {
			
			pom=Float.parseFloat(br.readLine());
			
		}catch(Exception e) {}
		
		System.out.print("Anzal der Durstlöcher: ");
		
		try {
			
			dur=Float.parseFloat(br.readLine());
			
		}catch(Exception e) {}

		total=1.5f*pom+1.29f*dur;
		
		System.out.println(total + " €");
		
		if(total<8.58f) {
			
			System.out.println("Das Geld reicht zum Glück noch!");
			
		}
		else {
			
			System.out.println("Das Geld reicht leider nicht!");
			
		}
		
	}
	
}
