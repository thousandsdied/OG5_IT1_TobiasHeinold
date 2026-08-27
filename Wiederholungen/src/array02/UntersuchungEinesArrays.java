package array02;

import java.util.Arrays;

public class UntersuchungEinesArrays {
	
	public static String algorithmus(int[] a) {
		
		Arrays.sort(a);
		
		int max = 1;
		
		int count = 1;
		
		int num = a[0];
		
		int most= a[0];
		
		for (int i = 1 ; i<a.length ; i++) {
			System.out.println(num + "|"+a[i]);
			if(num==a[i]) {
				
				count++; 
				
				if(max<count) {
				
					most=a[i];
					
					max=count;}
				
			}
			else {
				
				count=1;
				
				num=a[i];
				
			}
			
		}
		
		return "Haeufigste Zahl: "+most + "("+max+" Vorkommen)";
	}
	
	public static void main(String[] args) {
		
		int[] test = {0,0,1,1,1,2,2,2};
		
		System.out.println(algorithmus(test));
		
		
	}

}
