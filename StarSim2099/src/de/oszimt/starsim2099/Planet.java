package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends GroßRaumobjekt{

	// Attribute
	private int anzahlHafen;
	
	// Methoden
	
	public Planet() {art="Planet";}
	
	public int getAnzahlHafen(){return anzahlHafen;}
	
	public void setAnzahlHafen(int anzHaf){this.anzahlHafen=anzHaf;}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
