package array02;
public class ArrayUebung {
	
	public static void main(String args[]) {

		int[] einArray;
		
		einArray= new int[100];
		
		for(int i=0 ; i<einArray.length ; i++) {
			
			System.out.println("Index "+i+" - Inhalt: "+einArray[i]);
			
		}
		
		for(int i = 0 ; i<100 ; i++) {
			
			einArray[i]=i;
			
		}
		
		System.out.println(einArray[89]);
		
		einArray[49]=1060;
		einArray[0]=2020;
		einArray[99]=2020;
		double durchschnitt=0;
		for(int i=0 ; i<einArray.length ; i++) {
			
			System.out.println("Index "+i+" - Inhalt: "+einArray[i]);
			
			durchschnitt+=einArray[i];
			
		}
		
		durchschnitt=durchschnitt/einArray.length;
		
		System.out.println("Durchschnitt: "+durchschnitt);
		
	}	
		
}