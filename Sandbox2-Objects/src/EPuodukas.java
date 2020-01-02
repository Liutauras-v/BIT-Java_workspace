
public class EPuodukas extends Puodukas {

	private int temp;

	public EPuodukas(int turis) {
		super("Metalas", turis);
		this.temp = 20;
	}

	public int getTemp() {
		return this.temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "EPuodukas [temp=" + this.temp + "] " + super.toString() + " " + super.toString();
	}
	
	
	
	

}
