package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] liste, long suchwert) {
		
		if(liste.length==0) {
			return -1;
		}
		
		int von = 0;
		int bis = liste.length-1;
		
		for(int i = 0 ; i<10 ; i++) {
			
			int index = (int) (von + ( bis-von ) * (  (double)suchwert-liste[von] ) / ( liste[bis]-liste[von] ));
			
			if(index>liste.length || suchwert<liste[0])
				return -1;
			
			if(liste[index]==suchwert) {			
				return index;				
			}	
			else if(index<=von || index>=bis || von>=bis)
				return -1;

			if(liste[index]<suchwert) {
				von=index+1;
			}	
			else {
				bis=index-1;
			}

		}		

		
		return -1;
	}
	
	

}
