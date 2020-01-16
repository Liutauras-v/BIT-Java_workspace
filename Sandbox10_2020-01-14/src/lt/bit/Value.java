package lt.bit;

public class Value {

	private String v;
	
	public Value(String v) {
		this.v = v;
	}
	
	public String toString() {
		return "Value:" + this.v;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.v == null) ? 0 : this.v.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (this.v == null) {
			if (other.v != null)
				return false;
		} else if (!this.v.equals(other.v))
			return false;
		return true;
	}
	
	
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//		if(!(this.getClass() != obj.getClass())) {
//			return false;
//		}
//		Value other = (Value) obj;
//		return this.v.equals(other.v);
//		
//	}
//	
	
	
	
}
