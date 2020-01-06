package lt.bit;

public class Labas {

	private String name;

	public Labas() {
		this("Bevardis");
	}

	public Labas(String name) {
		this.name = name;
	}

	public Labas(String name, String surName) {
		this(name + " " + surName);
	}

	public void hello() {
		System.out.println("Hello " + this.name);
	}

}
