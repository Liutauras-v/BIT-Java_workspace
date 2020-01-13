package lt.bit;

public class Core {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		list.add("hi");
		list.add("person");
		list.add(123);
		list.add(new Object());
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list);

		list.set(1, "you");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);	
		
		
	}

}
