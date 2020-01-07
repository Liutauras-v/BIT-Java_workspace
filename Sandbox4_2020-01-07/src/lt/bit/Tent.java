package lt.bit;

public class Tent implements Electricity {

	@Override
	public void turnOn() {
		System.out.println("Tent: Lights are on...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tent: Lights are off...");
		
	}
	

}
