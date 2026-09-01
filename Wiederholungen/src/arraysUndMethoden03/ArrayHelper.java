package arraysUndMethoden03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayHelper {

	
//zur Hilfe mit debugging (z.B. double[] bei aufgabe 4) generischer array statt int[]	
	
	public static <T> String convertArrayToString(T[] zahlen) {
		
		String res = "";
		
		try{
			for(int i = 0 ; i<zahlen.length-1 ; i++) {
			
			res+=zahlen[i];
			res+=", ";
			
			}
		
			res+=zahlen[zahlen.length-1];
		
		}
		catch(Exception e ) {}
		return res;
	}
	
	public static void umdrehen(Integer[] zahlen) {
		
		Collections.reverse(Arrays.asList(zahlen));
		
	}
	
	public static Integer[] umdrehenNeu(int[] zahlen) {
		
		Integer[] temp = new Integer[zahlen.length];
		
		int e = 0;
		
		for(int i = zahlen.length-1 ; i>=0 ; i--) {
			
			temp[e]=zahlen[i];
			
			e++;
			
		}
		
		return temp;
		
	}
	
	public static Double[][] temperaturTabelle(int hoehe){
		
		Double[][] res = new Double[hoehe][2];
		
		for(int i = 0 ; i<hoehe ; i++) {
			
			res[i][0]=i*10.0;
			
			res[i][1]=((5.0/9.0)*(i*10.0-32.0));
			
			System.out.println(5/9*(i*10-32));
			
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,6,2,8,23};
		
		umdrehen(arr);
		
		System.out.println(convertArrayToString(arr));
			
		for(Double[] i : temperaturTabelle(10)) {
			
			System.out.println(convertArrayToString(i));
			
		}
		 
	}
	
	
}
