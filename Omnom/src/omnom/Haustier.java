package omnom;

public class Haustier {
	
	private int hunger,muede,zufrieden,gesund;
		
	private String name;
	
	public Haustier() {}
	
	public Haustier(String name) {this.name=name;}
	
	public int getHunger(){return hunger;}
	
	public int getMuede(){return muede;}
	
	public int getZufrieden(){return zufrieden;}
	
	public int getGesund(){return gesund;}
	
	public String getName(){return name;}
	
	public void setHunger(int hunger) {this.hunger = hunger;}
	
	public void setMuede(int muede) {this.muede = muede;}
	
	public void setZufrieden(int zufrieden) {this.zufrieden = zufrieden;}
	
	public void setGesund(int gesund) {this.gesund = gesund;}
	
	public void setName(String name) {this.name = name;}
	
	public void fuettern(int futter){hunger+=futter;}
	
	public void schlafen(int zeit){muede+=zeit;}
	
	public void spielen(int zeit){zufrieden+=zeit;}
	
	public void heilen() {gesund=100;}

}
