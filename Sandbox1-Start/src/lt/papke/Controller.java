package lt.papke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("all")
public class Controller {
	
	public static void main(String[] args) {

		// smth();
		// by3();
		// arrays();
		// .out.println(bonusTime(12, false));
//		scanneris();
//		pam2();
		sort();
	}

	public static void by3() {
		int nuo = 3;
		int iki = 7;
		int sum = 0;
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (nuo <= iki) {
			if (nuo % 3 == 0) {
				list.add(nuo);
				sum += nuo;
				count++;
			}
			nuo++;
		}

		System.out.println("List: " + Arrays.toString(list.toArray()));
		System.out.println("Sum: " + sum);
		System.out.println("Avrg: " + (float) sum / count);
	}

	public static void arrays() {

		double[] m = new double[5];
		System.out.println(m.length);
		double s = m[0] + m[1] + m[2] + m[3] + m[4];
		System.out.println(s);

	}

	public static String bonusTime(final int salary, final boolean bonus) {
		return String.valueOf('\u00A3') + ((bonus) ? Integer.toString(salary * 10) : Integer.toString(salary));
	}

	public static void smth() {
		for (boolean s = true; s;) {
			double d = Math.random();
			if (d > 0.9) {
				s = false;
			}
			System.out.println(d);
		}
	}

	public static void scanneris() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		switch (a) {
		case 1:
		case 2:
		case 12:
			System.out.println("ziema");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("pavasaris");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("vasara");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("ruduo");
			break;
		default:
			System.out.println("no");
			break;
		}
	}
	
	
	public static void pam2() {
		long a = 123_143_566_____14L;
		
		System.out.println(a);
		
		char b = '\uAB13';
		System.out.println(b);
		
		System.out.println(~b);
		
		char c = 'a';
		c = (char) (c >> 2);
		System.out.println(c);
		
		
		
		int[] f = {1,2,3,4,5,6};
		
		for (int i : f) {
			System.out.println(i);
		}
		
		
	}
	
	public static void sort() {
		int[] array = { 10, 3, 4, 7, 8, 5, 10, 11 };

		boolean swapped = true;
		int j = 0;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] < array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapped = true;
				}
			}
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

}
