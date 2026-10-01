public class Mannschaftsleiter extends Spieler{

	private Mannschaft mannschaft;
	private double rabatt;
	
	public Mannschaft getMannschaft() {
		return mannschaft;
	}
	public void setMannschaft(Mannschaft mannschaft) {
		this.mannschaft = mannschaft;
	}
	public double getRabatt() {
		return rabatt;
	}
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}
	
	public Mannschaftsleiter() {};
	
}
