package Decorator;

public class DefensiveShip extends PowerfulShip{


	public DefensiveShip(SpaceShip ship) {
		super(ship);
	}

	@Override
	public void PowerUP() {
		p.PowerUP();
		System.out.println("Activating Shields.");
	}

}
