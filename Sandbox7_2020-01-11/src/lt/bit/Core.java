package lt.bit;

public class Core {

	public static void main(String[] args) {

		boolean hasFinished = false;
		int maxDist = 1000;

		Masina[] masinos = new Masina[] { new Masina("Audi"), new Masina("BMW"), new Masina("Ford"),
				new Masina("Lexus") };

		while (!hasFinished) {
			for (int i = 0; i < masinos.length; i++) {
				masinos[i].drive();
				System.out.println(masinos[i].getName() + "-" + masinos[i].getDist());
				if (masinos[i].getDist() >= maxDist) {
					hasFinished = true;
				}
			}
			System.out.println("-----------");
		}

	}

}
