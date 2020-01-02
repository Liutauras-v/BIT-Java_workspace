package lt.pkg;

public class Car {

	private String name;
	private int distance;
	private int speed;
	
	public Car() {
		CarsRandom names = new CarsRandom();
		this.name = names.getRandomName();
		this.distance = 0;
		this.speed = 0;
	}

	
	
	public void drive() {
		System.out.println("Error: No car selected to drive");
	}
	
	
	protected void speedUp(int by, int max) {
		this.speed += by;
		if(this.speed > max) {
			this.speed = max;
		}
	}
	
	protected void slowDown(int by) {
		this.speed += by;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	
	protected void markSportCar() {
		this.name += "*";
	}
	
	//===================================================
	
	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance += distance;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return this.name;
	}
	

}
