package lt.bit.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import lt.bit.MyLinkedList;

public class MyLinkedListTest {

	@Test
	public void createLinkedList() {
		MyLinkedList list = new MyLinkedList();

		Assert.assertTrue((list != null));
	}

	@Test
	public void toStringAnEmptyList() {
		MyLinkedList list = new MyLinkedList();

		Assert.assertEquals(list.toString(), "[]");
	}

	@Test
	public void addElementsToLinkedList() {
		MyLinkedList list = new MyLinkedList();

		list.add("123 Hello");
		list.add(123);
		list.add(null);

		Assert.assertEquals(list.toString(), "[123 Hello, 123, null]");
	}

	@Test
	public void getSize() {
		MyLinkedList list = new MyLinkedList();

		Assert.assertEquals(list.size(), 0);

		list.add("123 Hello");
		list.add(123);

		Assert.assertEquals(list.size(), 2);

		list.add("Test");

		Assert.assertEquals(list.size(), 3);

		list.remove(0);
		list.remove(0);

		Assert.assertEquals(list.size(), 1);

		list.remove(0);

		Assert.assertEquals(list.size(), 0);
	}

	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void getFromAnEmptyList() {
		MyLinkedList list = new MyLinkedList();

		list.get(0);
		list.get(1);
	}

	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void getWithTooBigIndex() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.get(200);
	}

	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void getWithTooSmallIndex() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.get(-10);
	}

	@Test
	public void getItemFromList() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");
		list.add(123);
		list.add(null);

		Assert.assertEquals(list.get(0), "Hello");
		Assert.assertEquals(list.get(1), "world");
		Assert.assertEquals(list.get(2), 123);
		Assert.assertEquals(list.get(3), null);

	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void setToEmpty() {
		MyLinkedList list = new MyLinkedList();

		list.set(0, "123");
		list.set(1, 123);
	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void setToIndexOfTooBig() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.set(200, "123");
	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void setToIndexOfTooSmall() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.set(-200, "123");
	}
	
	@Test
	public void setAnItemToList() {
		MyLinkedList list = new MyLinkedList();
		
		list.add("Hello");
		list.add("world");
		list.add(123);
		list.add(null);
		
		list.set(0, "Hey");
		list.set(1, "Planet");
		list.set(2, null);
		list.set(3, 456);

		Assert.assertEquals(list.get(0), "Hey");
		Assert.assertEquals(list.get(1), "Planet");
		Assert.assertEquals(list.get(2), null);
		Assert.assertEquals(list.get(3), 456);

	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void removeFromEmpty() {
		MyLinkedList list = new MyLinkedList();

		list.remove(0);
		list.remove(1);
	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void removeFromIndexTooSmall() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.remove(200);
	}
	
	@Test(expectedExceptions = { IndexOutOfBoundsException.class })
	public void removeFromIndexTooBig() {
		MyLinkedList list = new MyLinkedList();

		list.add("Hello");
		list.add("world");

		list.remove(-200);
	}
	
	@Test
	public void removeAnItem() {
		MyLinkedList list = new MyLinkedList();
		
		list.add("Hello");
		list.add("world");
		list.add(123);
		list.add(null);
		
		list.remove(2);
		
		Assert.assertEquals(list.toString(), "[Hello, world, null]");
		
		list.remove(0);
		
		Assert.assertEquals(list.toString(), "[world, null]");
		
		list.remove(0);
		list.remove(0);
		
		Assert.assertEquals(list.toString(), "[]");
	}

}
