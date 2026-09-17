package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	
	private double posX,posY;
	private int maxKapazitaet,winkel;
	private String typ,antrieb;
	
	
	// Methoden

	public double getPosX(){return posX;}
	public double getPosY(){return posY;}
	public int getMaxLadekapazitaet(){return maxKapazitaet;}
	public int getWinkel(){return winkel;}
	public String getTyp(){return typ;}
	public String getAntrieb(){return antrieb;}
	
	public void setPosX(double posX){this.posX=posX;}
	public void setPosY(double posY){this.posY=posY;}
	public void setMaxLadekapazitaet(int maxKap){this.maxKapazitaet=maxKap;}
	public void setWinkel(int winkel){this.winkel=winkel;}
	public void setTyp(String typ){this.typ=typ;}
	public void setAntrieb(String antrieb){this.antrieb=antrieb;}
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}
