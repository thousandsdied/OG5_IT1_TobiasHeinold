public class Spieler extends Mitglied{

	private int trikotnummer;
	private String position;
	private Mannschaft mannschaft;
	
	public int getTrikotnummer() {
		return trikotnummer;
	}
	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Mannschaft getMannschaft() {
		return mannschaft;
	}
	public void setMannschaft(Mannschaft mannschaft) {
		this.mannschaft = mannschaft;
	}
	
	public Spieler() {super();};
	
}
