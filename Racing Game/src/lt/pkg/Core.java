package lt.pkg;

import java.util.Random;

public class Core {

	public static char[] cars = { 'A', 'B', 'C' };
	public static int[] dist = { 0, 0, 0 };

	public static void main(String[] args) {

		startRace();

	}

	@SuppressWarnings("unused")
	public static void startRace() {

		int[] config = { 30, // random max speed
				200, // distance to win
		};

		Random rand = new Random();

		for (int i = 0; i < dist.length; i++) {
			dist[i] += rand.nextInt(config[0] + 1);
		}

		boolean swapped = true;
		int j = 0;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < dist.length - j; i++) {
				if (dist[i] < dist[i + 1]) {
					int tmp1 = dist[i];
					dist[i] = dist[i + 1];
					dist[i + 1] = tmp1;

					char tmp2 = cars[i];
					cars[i] = cars[i + 1];
					cars[i + 1] = tmp2;
					swapped = true;
				}
			}
		}

		for (int i = 0; i < dist.length; i++) {
			System.out.println(cars[i] + "-" + dist[i]);
		}
		System.out.println();

		for (int i = 0; i < dist.length; i++) {
			if (dist[i] >= 200) {
				printRes(cars[i], dist[i]);
				return;
			} else {
				startRace();
				return;
			}
		}

	}

	public static void printRes(char car, int dist) {

		System.out.println("\n==============================");
		System.out.println("The winner is: " + car + " with: " + dist + "km");

	}

}
