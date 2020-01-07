package lt.bit;

public class MyList implements MyArrayList {

	private Object[] array;

	public MyList() {
		this.array = new Object[0];
	}

	@Override
	public void add(Object obj) {
		Object[] newArr = new Object[this.array.length + 1];
		for (int i = 0; i < this.array.length; i++) {
			newArr[i] = this.array[i];
		}
		newArr[newArr.length - 1] = obj;
		this.array = newArr;
	}

	@Override
	public Object get(int index) {
		try {
			return this.array[index];
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void set(int index, Object obj) {
		if (this.array.length < index || index < 0) {
			try {
				throw new MyError("Out of bounds... Looking for index of: " + index + ", but list length is: "
						+ this.array.length);
			} catch (MyError e) {
				e.printStackTrace();
			}
		}
		this.array[index] = obj;

	}

	@Override
	public void remove(int index) {
		if (this.array.length < index || index < 0) {
			try {
				throw new MyError("Out of bounds... Looking for index of: " + index + ", but list length is: "
						+ this.array.length);
			} catch (MyError e) {
				e.printStackTrace();
			}
		}
		if (this.array.length == 1) {
			this.array = new Object[0];
			return;
		}
		Object[] newArr = new Object[this.array.length - 1];
		for (int i = 0, count = 0; i < this.array.length; i++) {
			if (i == index) {
				continue;
			}
			newArr[count] = this.array[i];
			count++;
		}
		this.array = newArr;
	}

	@Override
	public int size() {
		return this.array.length;
	}

	@Override
	public String toString() {
		String sb = "[";
		for (int i = 0; i < this.array.length; i++) {
			sb += " " + this.array[i] + ",";
		}
		if (this.array != null && this.array.length > 0) {
			sb = sb.substring(0, sb.length() - 1);
		}
		sb += " ]";
		return sb;
	}

}
