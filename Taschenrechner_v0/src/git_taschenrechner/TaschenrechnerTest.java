package git_taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		Taschenrechner ts = new Taschenrechner();

		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Multiplizieren |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);
		int i = 0;
		int e = 0;
		// Switch construct
		switch (swValue) {
		case '1':
			System.out.print("1. Summand: ");
			i = myScanner.nextInt();
			System.out.print("1. Summand: ");
			e = myScanner.nextInt();
			System.out.println(i+" + "+e+" = "+ts.add(i, e));
			break;
		case '2':
			System.out.print("Minuend: ");
			i = myScanner.nextInt();
			System.out.print("Subtrahend: ");
			e = myScanner.nextInt();
			System.out.println(i+" - "+e+" = "+ts.sub(i, e));
			break;
		case '3':
			System.out.print("1. Faktor: ");
			i = myScanner.nextInt();
			System.out.print("2.. Summand: ");
			e = myScanner.nextInt();
			System.out.println(i+" * "+e+" = "+ts.mul(i, e));
			break;
		case '4':
			System.out.print("Divident: ");
			i = myScanner.nextInt();
			System.out.print("Divisor: ");
			e = myScanner.nextInt();
			System.out.println(i+" / "+e+" = "+ts.div(i, e));
			break;	
		case '5': System.exit(0); 
		  
		  
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}

	}

}
