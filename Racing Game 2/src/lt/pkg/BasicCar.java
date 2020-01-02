package lt.pkg;

public class BasicCar extends Car {
	
	private final int maxSpeed = 100;
	CarsRandom cr = new CarsRandom();

	public BasicCar() {
		super();
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	@Override
	public void drive() {
		float rng = (float) Math.random();
		if(rng <= 0.1) {
			super.slowDown(cr.getRandomSlowDown(true));
		}
		else if(rng >= 0.6) {			
			super.speedUp(cr.getRandomSpeedUp(true), maxSpeed);
		}
		super.setDistance(this.getSpeed());
	}
	

}
