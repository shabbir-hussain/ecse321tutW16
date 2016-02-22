package Decorator;

public abstract class PowerfulShip extends SpaceShip{

	SpaceShip p;
	public PowerfulShip(SpaceShip ship){
		p= ship;
	}

	
	@Override
	public void FireLasers() {
		p.FireLasers();
	}
	
	public abstract void PowerUP();

	
}
