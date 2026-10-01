public class Mannschaftsleiter extends Spieler{

	private Mannschaft leitendeMannschaft;
	private double rabatt;
	
	public Mannschaft geLeitendetMannschaft() {
		return leitendeMannschaft;
	}
	public void setLeitendeMannschaft(Mannschaft mannschaft) {
		this.leitendeMannschaft = mannschaft;
	}
	public double getRabatt() {
		return rabatt;
	}
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}
	
	public Mannschaftsleiter() {};
	
}
