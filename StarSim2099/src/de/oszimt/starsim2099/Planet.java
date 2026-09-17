package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	
	private double posX,posY;
	private int anzahlHafen;
	private String name;
	
	// Methoden
	
	public double getPosX(){return posX;}
	public double getPosY(){return posY;}
	public int getAnzahlHafen(){return anzahlHafen;}
	public String getName(){return name;}
	
	public void setPosX(double posX){this.posX=posX;}
	public void setPosY(double posY){this.posY=posY;}
	public void setAnzahlHafen(int anzHaf){this.anzahlHafen=anzHaf;}
	public void setName(String name){this.name=name;}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
