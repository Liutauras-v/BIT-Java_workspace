package lt.pkg;

public class Core {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 10, 3, 12};
		leftToRight(arr);
		System.out.println("\n\n====================\n");
		rightToLeft(arr);

	}

	public static void leftToRight(int[] arr) {

		for (int out : arr) {
			System.out.print(out + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;

			for (int out : arr) {
				System.out.print(out + " ");

			}
		}
	}

	public static void rightToLeft(int[] arr) {
		for (int out : arr) {
			System.out.print(out + " ");
		}

		for (int i = arr.length - 1; i > -1; i--) {
			System.out.println();
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;

			for (int out : arr) {
				System.out.print(out + " ");

			}
		}
	}

}
