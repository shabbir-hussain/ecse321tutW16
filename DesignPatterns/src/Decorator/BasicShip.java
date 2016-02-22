package Decorator;

public class BasicShip extends SpaceShip {

	public BasicShip(){
	}
	
	
	
	@Override
	public void FireLasers() {
		System.out.println("Ima FIRING ma LAZERS");
		
	}

	@Override
	public void PowerUP() {
		//do nothing
	}

}
