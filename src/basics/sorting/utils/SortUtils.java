package basics.sorting.utils;

import java.util.Random;

public class SortUtils {

	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static boolean less(int a, int b) {
		return a < b;
	}

	public static void exchange(Comparable array[], int from, int to) {

		Comparable temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

	public static void exchange(int[] input, int i, int r) {
		int temp = input[i];
		input[i] = input[r];
		input[r] = temp;
	}

	public static String arrayToString(Comparable[] array) {

		if (array == null) {
			return "NULL ARRAY";
		}

		StringBuilder builder = new StringBuilder();
		for (Comparable eachItem : array) {
			builder.append(eachItem).append(":");
		}

		return builder.toString();
	}

	public static String arrayToString(int[] input) {
		if (input == null) {
			return "NULL ARRAY";
		}

		StringBuilder builder = new StringBuilder();
		for (int eachItem : input) {
			builder.append(eachItem).append(":");
		}

		return builder.toString();

	}

	public static boolean isSorted(int[] input) {

		for (int count = 0; count < input.length - 1; count++) {
			//System.out.println("Comparing : " + input[count] + " & " + input[count + 1]);
			if (input[count] > input[count + 1])
				return false;

		}
		return true;
	}

	public static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	public static boolean isSorted(int[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	public static int[] generateRandomData(int count) {

		int[] randomData = new int[count];
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			randomData[i] = random.nextInt(count);
		}

		return randomData;
	}

	
	public static int[] generateDuplicateData(int count) {

		int[] duplicateData = new int[count];
		for (int i = 0; i < count; i++) {
			duplicateData[i]=2; //just any number would do. Just bored with the default 0
		}
		
		return duplicateData;
	}
	
	public static Integer[] convertIntArrayToIntegerArray(int[] input) {

		Integer[] newArray = new Integer[input.length];
		int i = 0;
		for (int value : input) {
			newArray[i++] = Integer.valueOf(value);
		}

		return newArray;
	}
	
}