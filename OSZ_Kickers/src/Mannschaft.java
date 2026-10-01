import java.util.ArrayList;

public class Mannschaft {

	private String name;
	private ArrayList<Spieler> kader;
	private Trainer trainer;
	private ArrayList<Spiel> spielListe;
	private char spielklasse;
	
	public char getSpielklasse() {
		return spielklasse;
	}
	public void setSpielklasse(char spielklasse) {
		this.spielklasse = spielklasse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Spieler> getKader() {
		return kader;
	}
	public void setKader(ArrayList<Spieler> kader) {
		this.kader = kader;
	}
	public void addToKader(Spieler spieler) {
		kader.add(spieler);
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public ArrayList<Spiel> getSpielListe() {
		return spielListe;
	}
	public void setSpielListe(ArrayList<Spiel> spielListe) {
		if(spielListe.size()>10 && spielListe.size()<23) {
			this.spielListe = spielListe;
		}
		else {
			
			System.out.println("Angegebene Spielerliste ist zu groß oder zu klein");
			
		}
	}
	public void addToSpielListe(Spiel spiel) {
		spielListe.add(spiel);
	}
	
	public Mannschaft() {
		kader=new ArrayList<Spieler>();
		spielListe=new ArrayList<Spiel>();
	}
	
}
