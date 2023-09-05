
public class Linear_Search {

	public static int linearSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int value = 50;
		System.out.println(value + " is found at index: " + linearSearch(a1, value));
	}

	// implement linearsearch, search for 56;

	public class LinearSearch {

		public static int Linear_search(int arr[], int N, int x)

		{

			for (int i = 0; i < N; i++) {

				if (arr[i] == x)

					return i;

			}

			return -1;

		}

		public static void main(String[] args) {

			int[] arr = { 23, 34, 56, 75, 86, 98, 98, };

			int x = 10;

			int result = Linear_search(arr, arr.length, x);

			if (result == -1)

				System.out.print(

						"Element is not present in array");

			else

				System.out.print("Element is present at index "

						+ result);

		}

	}

}
