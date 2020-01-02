package lt.pkg;

import java.util.Random;

public class CarsRandom {

	private String[] names;
	Random rand = new Random();

	public CarsRandom() {
		this.names = new String[] { "Audi", "BMW", "Bugatti", "Chevrolet", "Citroen", "Ferrari", "Fiat", "Ford",
				"Honda", "Jaguar", "Jeep", "Kia", "Lamborghini", "Lexus", "Mazda", "Mercedes", "Mitsubishi", "Peugeot",
				"Porsche", "Nissan", "Renault", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" };
	}

	public String getRandomName() {
		String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String newName = this.names[rand.nextInt(this.names.length)] + "-";
		newName += alphabet.charAt(rand.nextInt(alphabet.length()));
		int idNumberCount = rand.nextInt(3) + 1;
		for (int i = 0; i < idNumberCount; i++) {
			newName += rand.nextInt(10);
		}
		return newName;
	}

	public int getRandomSpeedUp(boolean basic) {
		if (basic) {
			return rand.nextInt(46) + 5;
		} else {
			return rand.nextInt(96) + 5;
		}
	}

	public int getRandomSlowDown(boolean basic) {
		if (basic) {
			return rand.nextInt(10) + 1;
		} else {
			return rand.nextInt(20) + 1;
		}
	}

}
