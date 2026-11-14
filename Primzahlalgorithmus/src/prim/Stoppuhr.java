package prim;

public class Stoppuhr {

	private long startzeit,endzeit;
	
	public Stoppuhr() {}
	
	public void starten() {
		
		startzeit=System.currentTimeMillis();
		
	}
	
	public void stoppen() {
		
		endzeit=System.currentTimeMillis();
		
	}
	
	public void reset() {
		
		startzeit=endzeit=0;
		
	}
	
	public long getVergangeneZeit() {
		
		return endzeit-startzeit;
		
	}
}
