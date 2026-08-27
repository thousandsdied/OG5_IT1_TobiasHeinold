package array02;

import java.util.Arrays;

public class SelectionSort {

	public static int[] algorithmus(int[] a) {
		
		int curMin = 0;
		
		for(int i = 0 ; i<a.length-1 ; i++) {
			
			System.out.println(i);
			
			for(int e = i+1 ; e<a.length ; e++) {
				
				System.out.println("length="+a.length+", i="+i+", e="+e+", curMin="+curMin+", a="+Arrays.toString(a));
				
				if (a[curMin]>a[e]) {curMin=e;}
				
			}
			
			if(i!=a.length) {
			
				int temp=a[i];
				
				a[i]=a[curMin];
				
				a[curMin]=temp;
				
			}
			
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		int[] test = {1,5,23,4,3,6,8,0,3,5,6};
		
		System.out.println(Arrays.toString(algorithmus(test)));

		
	}

}
