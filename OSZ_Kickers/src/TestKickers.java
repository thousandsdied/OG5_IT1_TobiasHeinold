public class TestKickers {

	public static void main(String[] args) {
		
		Spieler spieler01 = new Spieler();
		spieler01.setName("Detlef DeSoost");
		spieler01.setTelefonnr("+49 66666666");
		spieler01.setPosition("Rechter Flügel");
		spieler01.setTrikotnummer(7);
		spieler01.setJahresbeitragBezahlt(false);
		
		Trainer trainer01 = new Trainer();
		trainer01.setName("Logi Yöw");
		trainer01.setTelefonnr("+49 12345678");
		trainer01.setLizenzklasse('A');
		trainer01.setAufwantsentschaedigung(400);
		trainer01.setJahresbeitragBezahlt(true);
		
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
		spieler02.setMannschaft("FC Mayern Bünchen");
		
		
		Mitglied[] mitglieder = {spieler01,spieler02,trainer01,schiri01};
		
		for(Mitglied m: mitglieder) {
			
			System.out.println(m.getName());
			
		}
		
	}
	
}
