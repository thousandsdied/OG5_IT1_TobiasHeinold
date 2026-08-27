package array02;

import java.util.Arrays;

public class ArrayVeraendern {

	static int[] a = {8,16,32,64,128};
	
	public static void main(String[] args) {
		
		int produkt=1;
		
		for(int i : a) {
			
			produkt*=i;
			
		}
		
		System.out.println("Produkt: "+produkt);
		
		int[] reversed = new int[a.length];
		
		int count=0;
		
		for(int i = a.length-1 ; i!=0 ; i--) {
			
			reversed[count]=a[i];
			count++;
			
		}

		System.out.println("Reversed: " + Arrays.toString(reversed));
		
		int[] b = new int[a.length+1];
		
		b[0]=4;
		
		for(int i = 1; i<b.length ;i++) {b[i]=a[i-1];}
		
		System.out.println(Arrays.toString(b));
		
	}

}
