package lt.bit;

public class SummerHouse implements ElWater {

	@Override
	public void flow() {
		System.out.println("Summer House: Water flows...");
		
	}

	@Override
	public void flush() {
		System.out.println("Summer House: Water has been flushed...");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Summer House: Lights are on...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Summer House: Lights are off...");
		
	}

	@Override
	public void oops() {
		System.out.println("oops");
		
	}

}
