package lt.pkg;

public class Game {
	
	public static Result res = new Result();
	public static int hours = 1;

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {

		Car[] cars = new Car[] { new SportCar(), new SportCar(), new BasicCar(), new BasicCar(), new BasicCar(),
				new BasicCar(), new BasicCar(), new BasicCar() };
		
		while (!allCarsFin(cars)) {
			hours++;
			for (int i = 0; i < cars.length; i++) {
				cars[i].drive();
				System.out.println(cars[i].getName() + " " + cars[i].getDistance());
			}
			System.out.println("===========");
		}
		res.printResult();
	}

	public static boolean allCarsFin(Car cars[]) {
		int count = 0;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getDistance() >= 1000) {
				count++;
				res.record(cars[i].getName(), hours);
			}
		}

		if (count == cars.length) {
			return true;
		}

		return false;
	}

}
