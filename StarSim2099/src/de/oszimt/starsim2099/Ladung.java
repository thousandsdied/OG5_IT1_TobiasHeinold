package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung extends Raumobjekt{

	// Attribute
	private int masse;
	private String typ;
	
	// Methoden
	
	public Ladung(){}
	
	public int getMasse(){return masse;}
	public String getTyp(){return typ;}

	public void setMasse(int masse){this.masse=masse;}
	public void setTyp(String typ){this.typ=typ;}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}