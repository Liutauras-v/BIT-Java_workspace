package lt.bit;

@SuppressWarnings("unused")
public class MyLinkedList {

	private Link head;

	public MyLinkedList() {

	}

	public void add(Object obj) {
		Link l = new Link();
		l.value = obj;

		if (head == null) {
			head = l;
			return;
		}

		Link last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = l;
		l.prev = last;

	}

	public int size() {
		if (head == null) {
			return 0;
		}
		int i = 1;
		Link last = head;
		while (last.next != null) {
			i++;
			last = last.next;
		}

		return i;
	}

	public Object get(int i) {
		if (i < 0 || i >= this.size()) {
			throw new IndexOutOfBoundsException();
		}

		Link last = head;
		int count = 0;
		while (i > count) {
			count++;
			last = last.next;
		}

		return last.value;
	}

	public void set(int i, Object obj) {
		if (this.size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (i > this.size() - 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}

		Link last = head;
		int count = 0;
		while (i > count) {
			count++;
			last = last.next;
		}
		last.value = obj;
	}

	public void remove(int i) {
		if (this.size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (i > this.size() - 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		Link l = new Link();
		Link last = head;

		Link prev = null;

		if (i == 0 && last != null) {
			head = last.next;
			return;
		}

		int count = 0;

		while (last != null) {

			if (count == i) {
				prev.next = last.next;
				break;
			}
			else {
				prev = last;
				last = last.next;
				count++;
			}
		}

	}

	public String toString() {
		String sb = "[";
		for (int i = 0; i < this.size(); i++) {
			sb += this.get(i) + ", ";
		}
		if (this.size() != 0) {
			sb = sb.substring(0, sb.length() - 2);
		}
		sb += "]";

		return sb;
	}

	private class Link {
		Object value;
		Link next;
		Link prev;
	}

}
