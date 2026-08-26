package malfolge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a3 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static int zahl = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Malfolge? ");
		
		try {
			
			zahl=Integer.parseInt(br.readLine());
			
		}catch(Exception e) {}
		
		
		for (int i = 0 ; i<=10 ; i++) {
			
			System.out.println(i + " * " + zahl + " = " + zahl*i);
			
		}
	
	}
	
}
