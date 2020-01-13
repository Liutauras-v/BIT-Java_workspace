package lt.bit;

public class Core {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Test t = new Test();

		System.out.println(t.sum(1, 2));

		System.out.println(t.sum(1, 2, 3));

		System.out.println(t.sum(1, 2, 3, 4));

		System.out.println(t.sum("1", 2));

		System.out.println("----------------");
		// -----------------------

		Labas l1 = new Labas();
		Labas l2 = new Labas("Piotar");
		Labas l3 = new Labas("Zmogus", "Zmogelis");

		l1.hello();
		l2.hello();
		l3.hello();
		
		System.out.println("----------------");
		//------------------------
		
		K3 k3 = new K3(3);
		System.out.println();
		K4 k4 = new K4();
		
		System.out.println("----------------");
		//------------------------
		
		lt.bit.pirmas.Labas labas = new lt.bit.pirmas.Labas();

		
	}

}
