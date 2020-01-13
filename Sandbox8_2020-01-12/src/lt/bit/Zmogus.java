package lt.bit;

public class Zmogus {
	
	private String name;
	private int age;
	private String gender;
	
	public Zmogus(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String prisistatyti() {
		return "Hello, my name is " + this.name;
	}
	
	public String prisistatytiSuAge() {
		return "Hello, my name is " + this.name + " " + this.age;
	}
	
	public void saiba() {
		if(this.gender == "v") {
			System.out.println("paleido");
		}
	}

}
