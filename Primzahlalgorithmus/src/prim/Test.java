package prim;

public class Test {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<9 ; i++) {
			
			long testNumber = i*(long)Math.pow(10, 18);
			
			long primeNumber = findNextPrime(testNumber);
			
			System.out.println(primeNumber +" braucht durchschnittlich "+findTime(primeNumber)/1000.0+" Sekunden");
			
		}
	}
		
	
	public static boolean isPrim(long zahl) {
		for(long i = 2 ; i<=(long)Math.sqrt(zahl) ; i++) {
			if(zahl%i==0) {
				return false;
			}
		}
		return true;	
	}
	
	public static long findNextPrime(long zahl) {
		
		boolean isPrim=isPrim(zahl);
		while(!isPrim) {
			isPrim=isPrim(++zahl);
			
		}
		
		return zahl;
		
	}
	
	public static long findTime(long zahl) {
		long totalTime = 0;
		for(int i = 0 ; i<10 ; i++) {
			Stoppuhr stoppuhr = new Stoppuhr();
			stoppuhr.starten();
			isPrim(zahl);
			stoppuhr.stoppen();
			totalTime+=stoppuhr.getVergangeneZeit();
		}
		return totalTime/10;
	}
}
