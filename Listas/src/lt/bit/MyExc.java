package lt.bit;

public class MyExc extends Exception {

	private static final long serialVersionUID = 1L;

	public MyExc(String message) {
		super(message);
	}

	public MyExc() {
		super();
	}

	public MyExc(Throwable c) {
		super(c);
	}

	public MyExc(String m, Throwable c) {
		super(m, c);
	}

}
