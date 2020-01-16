package lt.bit;

import java.lang.reflect.Method;

public class Core {

	public static void main(String[] args) {
		read(Level2.class);
	}

	public static void read(Class<?> cl) {
		if (cl != null) {
			System.out.println("\n-" + cl.getName());
			Method[] mt = cl.getDeclaredMethods();
			for (int i = 0; i < mt.length; i++) {
				System.out.println("--" + mt[i].toString());
			}
			read(cl.getSuperclass());
		}
	}

}
