package lt.bit;

public class MyList {
	
	private Object[] obj; 

	public MyList() {
		this.obj = new Object[0];
	}

	public void add(Object oblet) {
		
		Object[] newObj = new Object[this.obj.length + 1];
		for (int i = 0; i < this.obj.length; i++) {
			newObj[i] = this.obj[i];
		}
		newObj[newObj.length - 1] = oblet;
		this.obj = newObj;
	}
	
	
	public String toString() {
		String s = "[";
		for(int i = 0; i < this.obj.length; i++) {
			s += this.obj[i] + ", ";
		}
	    if (this.obj.length > 0) {
	        s = s.substring(0, s.length() - 2);
	    }
		s += "]";
		return s;
	}
	
	public Object get(int index) {
		return this.obj[index];
	}
	
	public void set(int a, Object b) {
		this.obj[a] = b;
	}
	
	public int size() {
		return this.obj.length;
	}
	
	public void remove(int index) {
		Object[] newObj = new Object[this.obj.length - 1];
		int count = 0;
		for(int i = 0; i < this.obj.length; i++) {
			if(index == i) {
				continue;
			}
			newObj[count] = this.obj[i];
			count++;
		}
		this.obj = newObj;
	}

}
