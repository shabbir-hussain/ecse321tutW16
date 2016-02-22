package Decorator;

public class FastShip extends PowerfulShip{

	public FastShip(SpaceShip ship) {
		super(ship);
	}

	@Override
	public void PowerUP() {
			p.PowerUP();
		
		System.out.println("Warp Drive 100% Ready");
	}

}
