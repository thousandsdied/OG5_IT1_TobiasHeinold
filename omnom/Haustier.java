
public class Haustier {

	private int hunger,muede,zufrieden,gesund,name;
	
	public Haustier() {}
	
	public Haustier(int name) {this.name=name;}
	
	public int getHunger () {return hunger;}
	public int getMuede () {return muede;}
	public int getZufrieden () {return zufrieden;}
	public int getGesund () {return gesund;}
	public int getName () {return name;}
	
	public void setHunger () {this.hunger=hunger;}
	public void setMuede () {this.muede=muede;}
	public void setZufrieden () {this.zufrieden=zufrieden;}
	public void setGesund () {this.gesund=gesund;}
	public void setName () {this.name=name;}
	
	public void fuettern(int anzahl) {hunger+=anzahl;}
	public void schlafen(int dauer) {muede+=dauer;}
	public void spielen(int dauer) {zufrieden+=dauer;}
	public void helen() {gesund=100;}
	
}
