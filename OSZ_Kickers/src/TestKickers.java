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
		
		Trainer trainer01 = new Trainer();
		trainer01.setName("Logi Yöw");
		trainer01.setTelefonnr("+49 12345678");
		trainer01.setLizenzklasse('A');
		trainer01.setAufwantsentschaedigung(400);
		trainer01.setJahresbeitragBezahlt(true);
		trainer01.addToMannschaften(mannschaft01);
		
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
		
		Spiel spiel01 = new Spiel();
		spiel01.setDatum("1.10.26");
		spiel01.setErgebnis("4:0");
		spiel01.setHeimGast("Heim");
		
		mannschaft01.addToKader(spieler01);
		mannschaft01.addToKader(spieler02);
		mannschaft01.setTrainer(trainer01);
		mannschaft01.addToSpielListe(spiel01);
		
		Mitglied[] mitglieder = {spieler01,spieler02,trainer01,schiri01};
		
		for(Mitglied m: mitglieder) {
			
			System.out.println(m.getName());
			System.out.println(m.getTelefonnr());
			System.out.println(m.getJahresbeitragBezahlt());
			
		}
		
	}
	
}
