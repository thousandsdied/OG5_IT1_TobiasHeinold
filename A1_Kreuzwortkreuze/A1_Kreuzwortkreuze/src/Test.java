import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	public static String[] einlesen(String datName) {
		
		String[] test = new String[4];
		
		try(Scanner scanner = new Scanner( new File(datName))){
			
			int i = 0;
			
			while (scanner.hasNextLine()) {
		        test[i] = scanner.nextLine();
		        i++;
			}
		
		}
		catch(FileNotFoundException e) {
			
			System.out.println(e);
			
		}
		
		return test;
		
	}
		
	public static void main(String[] args) {
		
		String[] test = einlesen("kreuz01.txt");
			
		String s1 = String.valueOf(test[0].charAt(1))+String.valueOf(test[1].charAt(1))+String.valueOf(test[2].charAt(1))+String.valueOf(test[3].charAt(1));
		String s2 = String.valueOf(test[0].charAt(2))+String.valueOf(test[1].charAt(2))+String.valueOf(test[2].charAt(2))+String.valueOf(test[3].charAt(2));
		String s3 = String.valueOf(test[1].charAt(0))+String.valueOf(test[1].charAt(1))+String.valueOf(test[1].charAt(2))+String.valueOf(test[1].charAt(3));
		String s4 = String.valueOf(test[2].charAt(0))+String.valueOf(test[2].charAt(1))+String.valueOf(test[2].charAt(2))+String.valueOf(test[2].charAt(3));
		ArrayList<String> stringListe = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
		ArrayList<ArrayList<String>> wortListen = new ArrayList<ArrayList<String>>();
		
		for (int i = 0 ; i<4 ; i++) {
		
			try(Scanner scanner = new Scanner(new File("wortliste.txt"))) {
				
				wortListen.add(new ArrayList<String>());
				
				while (scanner.hasNextLine()) {
					
					String scanned = scanner.nextLine();
					
					if(stringListe.get(i).charAt(0)!='.' && stringListe.get(i).charAt(0)!=scanned.charAt(0) || stringListe.get(i).charAt(3)!='.' && stringListe.get(i).charAt(3)!=scanned.charAt(3)) {
						
						
						
					}
					
					else {
						
						wortListen.get(i).add(scanned);
						
					}
					
				}
	
				
			}
			
			catch(FileNotFoundException e) {
				
				System.out.println(e);
				
			}
			
		}
		
		String cTemp=stringListe.get(2);
		String dTemp=stringListe.get(3);
		
		for(String a : wortListen.get(0)) {
			
			if (s1.charAt(1)==a.charAt(1)) {cTemp=cTemp.substring(0,1)+"."+cTemp.substring(2,4); }
			
			else if (s1.charAt(1)=='.') {cTemp=cTemp.substring(0,1)+a.charAt(1)+cTemp.substring(2,4);}
			
			else {cTemp=cTemp.substring(0,1)+s1.charAt(1)+cTemp.substring(2,4);}
			
			if (s1.charAt(2)=='.') {dTemp=dTemp.substring(0,1)+a.charAt(2)+dTemp.substring(2,4);  System.out.println("test");}
			
			else if (s1.charAt(2)==a.charAt(2)) {dTemp=dTemp.substring(0,1)+"."+dTemp.substring(2,4);}
			
			else {dTemp=dTemp.substring(0,1)+s1.charAt(2)+dTemp.substring(2,4);}
			
			
			for(String b : wortListen.get(1)) {
			
				if (s2.charAt(1)=='.') {cTemp=cTemp.substring(0,2)+b.charAt(1)+cTemp.substring(3,4); }
				
				else if (s2.charAt(1)==b.charAt(1)) {cTemp=cTemp.substring(0,2)+"."+cTemp.substring(3,4);}
				
				else {cTemp=cTemp.substring(0,2)+s2.charAt(1)+cTemp.substring(3,4);}
				
				
				if (s2.charAt(2)=='.') {dTemp=dTemp.substring(0,2)+b.charAt(2)+dTemp.substring(3,4);}
				
				else if (s2.charAt(2)==b.charAt(2)) {dTemp=dTemp.substring(0,2)+"."+dTemp.substring(3,4);}
				
				else {dTemp=dTemp.substring(0,2)+s2.charAt(2)+dTemp.substring(3,4);}
				
			
				Pattern patternC = Pattern.compile(cTemp);
				for(String c : wortListen.get(2)) {
					
					Matcher matcherC = patternC.matcher(c);
					
					if(matcherC.find()) {
						

																	
						Pattern patternD = Pattern.compile(dTemp);
								
								
								
						for(String d : wortListen.get(3)) {
									
							Matcher matcherD = patternD.matcher(d);
									
							if(matcherD.find()) {
								
			
										
								
								
								String res1 = "#  "+a.charAt(0)+"   "+b.charAt(0)+"  #";
								String res2 = String.valueOf(c.charAt(0))+" ";
								if(s1.charAt(1)=='.') {res2+=a.charAt(1);}
								
								else {
									
									res2+=s1.charAt(1)+"/";
								
									if(s1.charAt(1)!=a.charAt(1)){res2+=a.charAt(1);}
									
									else {res2+=c.charAt(1);}
									
								}
								
								res2+=" ";
								if(s2.charAt(1)=='.') {res2+=" " +b.charAt(1)+" ";}
								else {
									
									res2+=s2.charAt(1)+"/";
								
									if(s2.charAt(1)!=b.charAt(1)){res2+=b.charAt(1);}
									
									else {res2+=c.charAt(2);}
									
								}
								res2+=" ";
								res2+=c.charAt(3);
								String res3 = String.valueOf(d.charAt(0))+" ";
								if(s1.charAt(2)=='.') {res3+=a.charAt(2);}
								
								else {
									
									res3+=s1.charAt(2)+"/";
								
									if(s1.charAt(2)!=a.charAt(2)){res3+=a.charAt(2);}
									
									else {res3+=d.charAt(1);}
									
								}
								
								res3+=" ";
								if(s2.charAt(2)=='.') {res3+=" " +b.charAt(2)+" ";}
								else {
									
									res3+=s2.charAt(2)+"/";
								
									if(s2.charAt(2)!=b.charAt(2)){res3+=b.charAt(2);}
									
									else {res3+=d.charAt(2);}
									
								}
								res3+=" ";
								res3+=d.charAt(3);
								String res4 = "#  "+a.charAt(3)+"   "+b.charAt(3)+"  #";
								
								String[] results = {res1,res2,res3,res4};
								
								
								for(String s : test) {
									
									System.out.println(s);
									
								}
								
								System.out.println("\n\n\n\n");
								
								for(String s : results) {
									
									System.out.println(s);
									
								}
								
		
								
								System.exit(0);
										
							}													
							
						}							
																
					}
							
				}			
				
			}
			
			cTemp=s3;
			dTemp=s4;
			
		}	
		
	}
	
	
	
}
