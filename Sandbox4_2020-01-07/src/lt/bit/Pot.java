package lt.bit;

public class Pot implements Electricity {
	
	@Override
	public void turnOn() {
		System.out.println("Pot: Lights are on...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Pot: Lights are off...");
		
	}

}
