package omnom;

public class Haustier {
	
	private int hunger,muede,zufrieden,gesund;
		
	private String name;
	
	public Haustier() {hunger=muede=zufrieden=gesund=100;}
	
	public Haustier(String name) {this.name=name; hunger=muede=zufrieden=gesund=100;}
	
	public int getHunger(){return hunger;}
	
	public int getMuede(){return muede;}
	
	public int getZufrieden(){return zufrieden;}
	
	public int getGesund(){return gesund;}
	
	public String getName(){return name;}
	
	public void setHunger(int hungerNeu) {this.hunger = hungerNeu; if(hunger>100) {hunger=100;} if(hunger<0) {hunger=0;}}
	
	public void setMuede(int muedeNeu) {this.muede = muedeNeu; if(muede>100) {muede=100;} if(muede<0) {muede=0;}}
	
	public void setZufrieden(int zufriedenNeu) {this.zufrieden = zufriedenNeu; if(zufrieden>100) {zufrieden=100;} if(zufrieden<0) {zufrieden=0;}}
	
	public void setGesund(int gesundNeu) {this.gesund = gesundNeu; if(gesund>100) {gesund=100;} if(gesund<0) {gesund=0;}}
	
	public void setName(String name) {this.name = name;}
	
	public void fuettern(int futter){hunger+=futter;}
	
	public void schlafen(int zeit){muede+=zeit;}
	
	public void spielen(int zeit){zufrieden+=zeit;}
	
	public void heilen() {gesund=100;}

}
