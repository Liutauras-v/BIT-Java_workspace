package lt.bit;

import java.util.ArrayList;
import java.util.List;

public class Core {

	public static void main(String[] args) {

		House house = new House();
		Tent tent = new Tent();

		house.turnOn();
		tent.turnOn();

		Electricity el = house;

		el.turnOff();

		el = tent;

		el.turnOff();

		Pot pot = new Pot();
		el = pot;
		el.turnOn();

		el = house;

		System.out.println(el instanceof Electricity);
		System.out.println(el instanceof Ventilation);
		System.out.println(el instanceof Water);
		System.out.println(el instanceof House);
		System.out.println(el instanceof Tent);
		System.out.println("=====================\n");

		el = tent;

		System.out.println(el instanceof Electricity);
		System.out.println(el instanceof Ventilation);
		System.out.println(el instanceof Water);
		System.out.println(el instanceof House);
		System.out.println(el instanceof Tent);
		System.out.println("=====================\n");

		ElWater ew = new SummerHouse();

		ew.oops();
		try { // kad parodytu errora, be crash
			Ventilation v = (Ventilation) ew;
			System.out.println(v);
		} catch (Exception e) {
			System.out.println(e);
		}

		house.oops();

		System.out.println("=====================");

		Electricity[] houses = { new House(), new Tent(), new Pot(), new SummerHouse() };

		for (int i = 0; i < houses.length; i++) {
			houses[i].turnOn();
			try {
				((Ventilation) houses[i]).blow(1);

			} catch (Exception e) {

			}
		}
		
		System.out.println("\n\n\n");
		
		List<Object> list = new ArrayList<Object>();
		
		list.add("Hello");
		list.add(5);
		list.add("Hello");
		
		System.out.println(list);

		Integer io = new Integer(5);
		io++;
		System.out.println(io);
		
		Integer j = 7;
		
		int jj = j;
		
		System.out.println(jj);
		
	}

}
