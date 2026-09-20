import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	
	//Einlesen der gegebenen Datei. Gibt die Zeilen der Datei als String-Array wieder.
	
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
	
	//Erstellt aus dem Array, der aus der Datei gemacht wurde, patterns, die man zum späteren matchen mit der Wortliste benutzen kann.
	
	public static String[] erstellePatterns(String[] eingelesenes) {
		
		String pattern1 = String.valueOf(eingelesenes[0].charAt(1))+String.valueOf(eingelesenes[1].charAt(1))+String.valueOf(eingelesenes[2].charAt(1))+String.valueOf(eingelesenes[3].charAt(1));
		String pattern2 = String.valueOf(eingelesenes[0].charAt(2))+String.valueOf(eingelesenes[1].charAt(2))+String.valueOf(eingelesenes[2].charAt(2))+String.valueOf(eingelesenes[3].charAt(2));
		String pattern3 = String.valueOf(eingelesenes[1].charAt(0))+String.valueOf(eingelesenes[1].charAt(1))+String.valueOf(eingelesenes[1].charAt(2))+String.valueOf(eingelesenes[1].charAt(3));
		String pattern4 = String.valueOf(eingelesenes[2].charAt(0))+String.valueOf(eingelesenes[2].charAt(1))+String.valueOf(eingelesenes[2].charAt(2))+String.valueOf(eingelesenes[2].charAt(3));
		
		String[] patternArray = {pattern1,pattern2,pattern3,pattern4};
		
		return patternArray;
		
	}
	
	//Erstellt für jedes Wort eine ArrayList mit möglichen Wörtern. Dabei können Wörter, bei denen Anfangs- und Endbuchstaben nicht passen, direkt aussortiert werden.
	
	public static ArrayList<ArrayList<String>> erstelleMoeglicheWoerterListen(String[] patternArray){
		
		ArrayList<ArrayList<String>> wortListen = new ArrayList<ArrayList<String>>();
		
		for (int i = 0 ; i<4 ; i++) {
			
			try(Scanner scanner = new Scanner(new File("wortliste.txt"))) {
				
				wortListen.add(new ArrayList<String>());
				
				while (scanner.hasNextLine()) {
					
					String scanned = scanner.nextLine();
					
					if(!(patternArray[i].charAt(0)!='.' && patternArray[i].charAt(0)!=scanned.charAt(0) || patternArray[i].charAt(3)!='.' && patternArray[i].charAt(3)!=scanned.charAt(3))) {
						wortListen.get(i).add(scanned);
					}

				}
	
			}
			
			catch(FileNotFoundException e) {
				
				System.out.println(e);
				
			}
			
		}
		
		return wortListen;
		
	}
	
	//Mögliche Wörter werden nach und nach probiert. Dabei werden erst die beiden senkrechten Wörter benutzt damit dann die patterns der 
	//waagerechten Wörter angepassen werden können. Wenn alle 4 Wörter zu den 4 momentanen Pattern passen, werden diese als moegliche Loesung
	//in die ArrayList mit Loesungen gespeichert.
	
	public static ArrayList<String[]> findeWoerter(String[] patternArray, ArrayList<ArrayList<String>> wortListen) {
		
		
		
		ArrayList<String[]> results = new ArrayList<String[]>();
		
		String p1 = patternArray[0];
		String p2 = patternArray[1];
		String p3 = patternArray[2];
		String p4 = patternArray[3];
		
		String cTemp=p3;
		String dTemp=p4;
		
		for(String a : wortListen.get(0)) {
			
			
			if (p1.charAt(1) == a.charAt(1)) {
				cTemp = cTemp.substring(0, 1) + "." + cTemp.substring(2, 4);
			}

			else if (p1.charAt(1) == '.') {
				cTemp = cTemp.substring(0, 1) + a.charAt(1) + cTemp.substring(2, 4);
			}

			else {
				cTemp = cTemp.substring(0, 1) + p1.charAt(1) + cTemp.substring(2, 4);
			}

			if (p1.charAt(2) == '.') {
				dTemp = dTemp.substring(0, 1) + a.charAt(2) + dTemp.substring(2, 4);
			}

			else if (p1.charAt(2) == a.charAt(2)) {
				dTemp = dTemp.substring(0, 1) + "." + dTemp.substring(2, 4);
			}

			else {
				dTemp = dTemp.substring(0, 1) + p1.charAt(2) + dTemp.substring(2, 4);
			}
			
			String cTemp2=cTemp;
			String dTemp2=dTemp;
			
			for(String b : wortListen.get(1)) {
			
				if (p2.charAt(1) == '.') {
					cTemp2 = cTemp2.substring(0, 2) + b.charAt(1) + cTemp2.substring(3, 4);
				}

				else if (p2.charAt(1) == b.charAt(1)) {
					cTemp2 = cTemp2.substring(0, 2) + "." + cTemp2.substring(3, 4);
				}

				else {
					cTemp2 = cTemp2.substring(0, 2) + p2.charAt(1) + cTemp2.substring(3, 4);
				}

				if (p2.charAt(2) == '.') {
					dTemp2 = dTemp2.substring(0, 2) + b.charAt(2) + dTemp2.substring(3, 4);
				}

				else if (p2.charAt(2) == b.charAt(2)) {
					dTemp2 = dTemp2.substring(0, 2) + "." + dTemp2.substring(3, 4);
				}

				else {
					dTemp2 = dTemp2.substring(0, 2) + p2.charAt(2) + dTemp2.substring(3, 4);
				}
				
				Pattern patternC = Pattern.compile(cTemp2);
				
				for(String c : wortListen.get(2)) {
					
					Matcher matcherC = patternC.matcher(c);
					
					if(matcherC.find()) {
																	
						Pattern patternD = Pattern.compile(dTemp2);
									
						for(String d : wortListen.get(3)) {
									
							Matcher matcherD = patternD.matcher(d);
									
							if(matcherD.find()) {
								
								String[] result = {a,b,c,d};
								
								results.add(result);
								
							}
								
						}													
							
					}							
																
				}
				
				cTemp2=cTemp;
				dTemp2=dTemp;
							
			}	
		
			cTemp=p3;
			dTemp=p4;
			
		}
						
	return results;	
		
	}
	
	//Zeichnerische Darstellung der 4 Wörter zur Veranschaulichung.
	
	public static String zeichneLoesung(String[] loesung, String[] patternArray) {
		
		String zeichnung = "";
		
		String wort1 = loesung[0];
		String wort2 = loesung[1];
		String wort3 = loesung[2];
		String wort4 = loesung[3];
		
		String pattern1 = patternArray[0];
		String pattern2 = patternArray[0];
		

		
		String[] res1 = {
			" # "," "+wort1.substring(0,1)+" "," "+wort2.substring(0,1)+" "," # "
		};								
		
		String[] res2 = new String[4];
		
		res2[0]=" "+wort3.substring(0,1)+" ";
		
		if (pattern1.charAt(1)=='.') {
			res2[1]=" "+wort1.substring(1,2)+" ";
		}
		else if (pattern1.charAt(1)==wort1.charAt(1)) {
			res2[1]=wort1.charAt(1)+"/"+wort3.charAt(1);
		}
		else {
			res2[1]=wort3.charAt(1)+"/"+wort1.charAt(1);
		}
		
		if (pattern2.charAt(1) == '.') {
			res2[2] = " " + wort2.substring(1, 2) + " ";
		}
		else if (pattern2.charAt(1) == wort2.charAt(1)) {
			res2[2] = wort2.charAt(1) + "/" + wort3.charAt(2);
		}	
		else {
			res2[2] = wort3.charAt(2) + "/" + wort2.charAt(1);
		}
		res2[3]=" "+wort3.substring(3,4)+" ";
		
		String[] res3 = new String[4];
		
		//res3[0]=" "+wort4.substring(0,1)+" ";
		
		res3[0]=String.format("  %s ", wort4.substring(0,1));
		
		if (pattern1.charAt(2) == '.') {
			res3[1] = " " + wort1.substring(2, 3) + " ";
		}
		else if (pattern1.charAt(2) == wort1.charAt(2)) {
			res3[1] = wort1.charAt(2) + "/" + wort4.charAt(1);
		}
		else {
			res3[1] = wort4.charAt(1) + "/" + wort1.charAt(2);
		}

		if (pattern2.charAt(2) == '.') {
			res3[2] = " " + wort2.substring(2, 3) + " ";
		} else if (pattern2.charAt(1) == wort2.charAt(1)) {
			res3[2] = wort2.charAt(2) + "/" + wort4.charAt(2);
		} else {
			res3[2] = wort4.charAt(2) + "/" + wort2.charAt(2);
		}
		
		res3[3]=" "+wort4.substring(3,4)+" ";
		
		
		String[] res4 = {" # "," "+wort1.substring(3,4)+" "," "+wort2.substring(3,4)+" "," # "};
		
		
		
		String[][] res = {res1,res2,res3,res4};
		
		for(String[] sA : res) {
			
			zeichnung+="\n-----------------\n";
			
			zeichnung+="|";
			
			for(String s : sA) {
				
				zeichnung+=s+"|";
				
			}
			
		}

		zeichnung+="\n-----------------";							
		System.out.println(wort1);
		System.out.println(wort2);
		System.out.println(wort3);
		System.out.println(wort4);
		
		return zeichnung;
		
	}
	
	public static void dateiHinzufuegen() {
		
		System.out.print("Dateiname: ");
		
	}
	
	public static void HauptMenue() {
		
		String aktuelleDatei="";
		ArrayList<String> dateiliste = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("INPUT\n"
							  +"1 - Neue Datei einlesen ("+aktuelleDatei+")\n"
							  +"2 - Dateiliste anzeigen\n\n"
							  +"OUTPUT\n"
							  +"3 - Alle Lösungen anzeigen\n"
							  +"4 - Erste Lösung anzeigen\n"
							  +"5 - zufällige Lösung anzeigen\n\n"
							  +"ANDERES\n"
							  +"9 - Programm Beenden");
			
			int input = scanner.nextInt();
			
			switch(input) {
			
				case 1:  
				
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:	
					
				case 9:
					scanner.close();
					System.exit(0);
			}
		}
		
	}
	
	
	
	
		
	public static void main(String[] args) {
		
		Kreuzwortkreuz kreuz01 = new Kreuzwortkreuz("kreuz01.txt");
		
		kreuz01.einlesen();
		
		kreuz01.erstellePatterns();
		
		kreuz01.erstelleMoeglicheWoerterListen();
		
		kreuz01.findeWoerter();
		
		for(int i = 0 ; i<kreuz01.getMoeglicheKombinationen().size() ; i++) {
			
			System.out.println(kreuz01.zeichneLoesung(i));
			
		}
		
		
		
		/*String eingelesenes[] = einlesen("kreuz0b.txt");
		
		String[] patterns = erstellePatterns(eingelesenes);
		
		ArrayList<ArrayList<String>> woerterListen = erstelleMoeglicheWoerterListen(patterns);
		
		ArrayList<String[]> moeglicheKombinationen = findeWoerter(patterns, woerterListen);
		
		for(String[] loesung : moeglicheKombinationen) {
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------");
			
			System.out.println(zeichneLoesung(loesung,patterns));
			
		}
	*/	
	}
	
}
