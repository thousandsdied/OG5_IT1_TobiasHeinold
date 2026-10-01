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
		if(kader.size()>10 && kader.size()<23) {
			this.kader = kader;
		}
		else {
			System.out.println("Angegebener Kader ist zu groß oder zu klein");
		}
	}
	public void addToKader(Spieler spieler) {
		
		if(kader.size()<22) {
			kader.add(spieler);
		}
		else {		
			System.out.println("Es gibt schon 22 Spieler in diesem Kader. Bitte entfernen sie einen Spieler");		
		}
		
	}
	
	public void removeFromKader(int index) {
		if(kader.size()==11) {
			System.out.println("Es gibt nur noch 11 Spieler in diesem Kader. Bitte fügen sie vorher einen neuen hinzu");
		}
		else {
			if(kader.size()>index) {
				kader.remove(index);
			}
			else {
				System.out.println("Einen so vielten Spieler gibt es nicht");
			}
		}
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
		this.spielListe = spielListe;
	}
	public void addToSpielListe(Spiel spiel) {
		spielListe.add(spiel);
	}
	public void removeFromSpielListe(int index) {
		if(spielListe.size()>index) {
			spielListe.remove(index);
		}
		else {
			System.out.println("Ein so vieltes Spiel gibt es nicht");
		}
	}
	
	public Mannschaft() {
		kader=new ArrayList<Spieler>();
		spielListe=new ArrayList<Spiel>();
	}
	
}
