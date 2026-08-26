package eva;
import java.io.*;


public class a1 {
	
	private static String text = "";
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
	
	System.out.println("Bitte Wort eingeben");	
		
	try {
		 text = br.readLine();
      } catch (Exception e){
    	  
      }
	
	
	
	text=text.replaceAll(" ", "");

	
	System.out.println(text.length());
	
	}
}
