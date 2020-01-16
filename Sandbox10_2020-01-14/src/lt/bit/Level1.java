package lt.bit;

public class Level1 extends Top {

	public void m1(int a) {
		System.out.println("Level1.m1("+a+")");
		m1();
	}
	
	public void m2() {
		System.out.println("Level1.m2");
	}
	
}
