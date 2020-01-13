package lt.bit;

public class Core {

	public static void main(String[] args) {
		
		// object oriented programming
		
		Zmogus david = new Zmogus("david", 80, "v");
		
		System.out.println(david.prisistatyti());
		System.out.println(david.prisistatytiSuAge());
		david.saiba();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// functional oriented programming
		
		
		
		String vardas = "david";
		int age = 80;
		String gender = "v";
		
		
		
		System.out.println(prisistatyti(vardas));
		
		
		
		
		
		
		
		
		
	

	}
	
	
	public static String prisistatyti(String name) {
		
		return "Hello, my name is " + name;
	}

}
