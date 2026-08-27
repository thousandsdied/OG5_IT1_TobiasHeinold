package array02;

public class SucheInArray {
	
	public static String algorithmus(int[] einArray, int wert) {
		
		for(int i : einArray) {
			
			if(i==wert) {
				
				return "Gefunden!";

			}
			
		}
		
		return "Nicht Gefunden!";
			
	}
	
	public static void main(String[] args) {
		int[] test = {0,3,5,7,2,5,2};
		System.out.println(algorithmus(test,7));
		
	}

}
