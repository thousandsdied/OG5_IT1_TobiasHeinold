import java.util.ArrayList;

public class Trainer extends Mitglied{

	private char lizenzklasse;
	private int aufwantsentschaedigung;
	private ArrayList<Mannschaft> mannschaften;
	
	public char getLizenzklasse() {
		return lizenzklasse;
	}
	public void setLizenzklasse(char lizenzklasse) {
		this.lizenzklasse = lizenzklasse;
	}
	public int getAufwantsentschaedigung() {
		return aufwantsentschaedigung;
	}
	public void setAufwantsentschaedigung(int aufwantsentschaedigung) {
		this.aufwantsentschaedigung = aufwantsentschaedigung;
	}
	public ArrayList<Mannschaft> getMannschaften() {
		return mannschaften;
	}
	public void setMannschaften(ArrayList<Mannschaft> mannschaften) {
		this.mannschaften = mannschaften;
	}
	
	public Trainer() {};
	
}
