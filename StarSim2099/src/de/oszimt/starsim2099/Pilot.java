package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot extends Raumobjekt{

	// Attribute
	private String grad,name;
	
	// Methoden
	
	public Pilot() {}
	
	public String getGrad(){return grad;}
	public String getName(){return name;}
	
	public void setGrad(String grad){this.grad=grad;}
	public void setName(String name){this.name=name;}
	
}
