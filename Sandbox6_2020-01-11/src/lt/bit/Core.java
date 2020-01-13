package lt.bit;

import java.util.Random;

public class Core {

	public static void main(String[] args) {

		String[] names = new String[] { "Audi", "Bmw", "Ford" };
		int[] dist = new int[] { 0, 0, 0 };
		final int finish = 200;
		boolean hasFinished = false;

		while (!hasFinished) {
			
			for (int i = 0; i < names.length; i++) {
				dist[i] += new Random().nextInt(20 + 1);
				System.out.println(names[i] + "-" + dist[i] + "km");
				if(dist[i] >= finish) {
					hasFinished = true;
				}
			}
			System.out.println("===============");
		}

	}

}
