import java.util.ArrayList;

public class TestKickers {

	public static void main(String[] args) {
		
		Mannschaft mannschaft01 = new Mannschaft();
		mannschaft01.setName("FC Mayern Bünchen");
		mannschaft01.setSpielklasse('A');
		
		Spieler spieler01 = new Spieler();
		spieler01.setName("Detlef DeSoost");
		spieler01.setTelefonnr("+49 66666666");
		spieler01.setPosition("Rechter Flügel");
		spieler01.setTrikotnummer(7);
		spieler01.setJahresbeitragBezahlt(false);
		spieler01.setMannschaft(mannschaft01);
		
		mannschaft01.addToKader(spieler01);
		
		Trainer trainer01 = new Trainer();
		trainer01.setName("Logi Yöw");
		trainer01.setTelefonnr("+49 12345678");
		trainer01.setLizenzklasse('A');
		trainer01.setAufwantsentschaedigung(400);
		trainer01.setJahresbeitragBezahlt(true);
		trainer01.addToMannschaften(mannschaft01);
		
		mannschaft01.setTrainer(trainer01);
		
		Schiedsrichter schiri01 = new Schiedsrichter();
		schiri01.setName("Ennis Daytekin");
		schiri01.setTelefonnr("+49 87654321");
		schiri01.setSpiele(34);
		schiri01.setJahresbeitragBezahlt(true);
		
		Mannschaftsleiter spieler02 = new Mannschaftsleiter();
		spieler02.setName("Koshua Jimmich");
		spieler02.setTelefonnr("+49 12131415");
		spieler02.setPosition("Defensives Mittelfeld");
		spieler02.setTrikotnummer(6);
		spieler02.setMannschaft(mannschaft01);
		spieler02.setLeitendeMannschaft(mannschaft01);
		spieler02.setRabatt(0.03);
		spieler02.setJahresbeitragBezahlt(true);
		
		mannschaft01.addToKader(spieler02);
		
		Spiel spiel01 = new Spiel();
		spiel01.setDatum("1.10.26");
		spiel01.setErgebnis("4:0");
		spiel01.setHeimGast("Heim");

		mannschaft01.addToSpielListe(spiel01);

		ArrayList<Spieler> testKader = new ArrayList<Spieler>();
		
	
		
		for(int i = 0 ; i<9 ; i++) {
			mannschaft01.addToKader(new Spieler());
		}
		
		mannschaft01.setKader(testKader);
		Spieler spieler03 = new Spieler();
		testKader.add(spieler03);
		mannschaft01.setKader(testKader);
		mannschaft01.removeFromKader(6);
		Spieler spieler04 = new Spieler();
		mannschaft01.addToKader(spieler04);
		mannschaft01.removeFromKader(6);	
		
		for(int i = 0 ; i<12 ; i++) {
			mannschaft01.addToKader(new Spieler());
		}
		
		for(Spieler s : mannschaft01.getKader()) {
			
			System.out.println(s.getName());
			System.out.println(s.getTelefonnr());
			System.out.println(s.getJahresbeitragBezahlt());
			
		}
		
		System.out.println(mannschaft01.getKader().size());
		
	}
	
}
