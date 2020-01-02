package lt.pkg;

public class Game {

//	private static Car[] placements;

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {

		Car[] cars = new Car[] { new SportCar(), new SportCar(), new BasicCar(), new BasicCar(), new BasicCar(),
				new BasicCar(), new BasicCar(), new BasicCar() };

//		placements = new Car [cars.length];
		
		while (!allCarsFin(cars)) {
			for (int i = 0; i < cars.length; i++) {
				cars[i].drive();
				System.out.println(cars[i].getName() + " " + cars[i].getDistance());
//				carFin(cars[i]);
			}
			System.out.println("===========");
		}

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Result:");

//		for (int i = 0; i < placements.length; i++) {
//			System.out.println((i + 1) + "# " + placements[i].getName());
//		}

	}

	public static boolean allCarsFin(Car cars[]) {
		int count = 0;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getDistance() >= 1000) {
				count++;
			}
		}

		if (count == cars.length) {
			return true;
		}

		return false;
	}

//	public static void carFin(Car car) {
//		if (car.getDistance() >= 1000 && isNotInPlacements(car)) {
//			Car[] newList = new Car[placements.length + 1];
//			for (int i = 0; i < newList.length - 1; i++) {
//				newList[i] = placements[i];
//			}
//			newList[newList.length - 1] = car;
//			placements = newList;
//		}
//	}
//
//	public static boolean isNotInPlacements(Car car) {
//		if (placements[0] == null) {
//			return false;
//		}
//		for (int i = 0; i < placements.length; i++) {
//			if (placements[i].equals(car)) {
//				return false;
//			}
//		}
//		return true;
//	}

}
