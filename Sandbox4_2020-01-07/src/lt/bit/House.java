package lt.bit;

public class House extends Infrastructure implements Ventilation {

	@Override
	public void flow() {
		System.out.println("House: Water flows...");
		
	}

	@Override
	public void flush() {
		System.out.println("House: Water has been flushed...");
		
	}

	@Override
	public void blow(int power) {
		System.out.println("House: Wind is blowing...");
		
	}

	@Override
	public void turnOn() {
		System.out.println("House: Lights are on...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("House: Lights are off...");
		
	}

//	@Override
//	public void oops() {
//		System.out.println("oops");
//		
//	}

}
