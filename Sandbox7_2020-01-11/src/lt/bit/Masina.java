package lt.bit;

import java.util.Random;

public class Masina {
	
	private int speed;
	private int maxSpeed;
	private int dist;
	private String name;
	
	public Masina(String name) {
		this.name = name;
		this.maxSpeed = 120;
		this.speed = 0;
		this.dist = 0;
	}
	
	public void drive() {
		this.dist += getNewSpeed();
	}
	
	private int getNewSpeed() {
		double rand = Math.random();
		
		if(rand < 0.2) {
			this.speed -= new Random().nextInt(10 + 1);
			if(this.speed <= 0) {
				this.speed = 0;
			}
			return this.speed;
		}
		else if(rand > 0.6) {
			this.speed += new Random().nextInt(20 + 1);
			if(this.speed > this.maxSpeed) {
				this.speed = this.maxSpeed;
			}
			return this.speed;
		}
		else {
			return this.speed;
		}
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDist() {
		return this.dist;
	}

}
