package array02;

public class VergleicheInnerhalbArrays {
	
	public static String algorithmus(int[] a, int[] b) {
		
		for (int i : a) {
			
			for (int e : b) {
				
				if(i==e) {
					
					return "Mindestens ein Wert kommt in beiden Int-Arrays vor";
					
				}
				
			}
			
		}
		
		return "Kein Wert kommt in beiden Int-Arrays vor";
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		int[] b = {5,6,7,8,9};
		
		System.out.println(algorithmus(a,b));

	}

}
