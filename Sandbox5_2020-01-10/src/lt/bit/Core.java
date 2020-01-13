package lt.bit;

public class Core {

	public static void main(String[] args) {
	
		Calculate calc = new Calculate(5, "dw");
		
		int suma = calc.sum(5, 7);

		System.out.println(calc.sum(5, 7));
		
		
		MyList list = new MyList();
		
		list.add("Hello");
		list.add("Hello");
		list.add(123);
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		
		System.out.println(list);
		list.set(1, "pasauli nx");
		System.out.println(list);
		
		
		MyList zmogus = new MyList();
		System.out.println(zmogus.size());
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list);
	}

}
