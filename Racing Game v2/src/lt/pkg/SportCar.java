package lt.pkg;

public class SportCar extends Car {
	
	private final int maxSpeed = 400;
	CarsRandom cr = new CarsRandom();

	public SportCar() {
		super();
		super.markSportCar();
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	@Override
	public void drive() {
		float rng = (float) Math.random();
		if(rng <= 0.1) {
			super.slowDown(cr.getRandomSlowDown(false));
		}
		else if(rng >= 0.6) {			
			super.speedUp(cr.getRandomSpeedUp(false), maxSpeed);
		}
		super.setDistance(this.getSpeed());
	}
	
}
