package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute
	
	private double posX,posY;
	private String grad,name;
	
	// Methoden

	public double getPosX(){return posX;}
	public double getPosY(){return posY;}
	public String getGrad(){return grad;}
	public String getName(){return name;}
	
	public void setPosX(double posX){this.posX=posX;}
	public void setPosY(double posY){this.posY=posY;}
	public void setGrad(String grad){this.grad=grad;}
	public void setName(String name){this.name=name;}
	
}
