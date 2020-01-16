package lt.bit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Core {

	public static void main(String[] args) {

//		Level2 l2 = new Level2();
//		l2.m1(3);
//		
//		System.out.println("- - - - - -");
//		Level1 l1 = new Level1();
//		l1.m1(5);
//		
//		System.out.println("- - - - - -");
//		Top t = new Level2();		
//		((Level1)t).m1(123);
//		t.m2();
//		System.out.println(t.getClass().getSimpleName());

	
//		List l = new ArrayList();
//		
//		l.add("hello");
//		l.add("Planet");
//		l.add(123);
		
//		HashSet h = new HashSet();
//		
//		h.add(123);
//		h.add("hello");
//		h.add("hello");
//		h.add(new String("hello"));
//		
//		
//		System.out.println(h);
		
		Value v1 = new Value("A");
		Value v2 = new Value("B");
		Value v3 = new Value("A");
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		System.out.println(v2 == v3);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		System.out.println(v2.equals(v3));
		
		
		HashSet h = new HashSet();
		
		h.add(v1);
		h.add(v2);
		h.add(v3);
		
		System.out.println(h);
		
		System.out.println(v1.hashCode());
		
	
	
	}

}
