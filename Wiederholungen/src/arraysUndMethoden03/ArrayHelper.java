package arraysUndMethoden03;

import java.util.Arrays;

public class ArrayHelper {
	
	public static String convertArrayToString(int[] zahlen) {
		
		return Arrays.toString(zahlen);
		
	}
	

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		String s = convertArrayToString(arr);
		
		for (int i = 0 ; i<s.length() ; i++) {
			
			System.out.println(s.charAt(i));
			
		}
		
	}
	
	
}
