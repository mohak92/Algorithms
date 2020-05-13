package com.mohak.sorting;

public class CountingSort {

	private int[] nums;

	public CountingSort(int[] nums) {
		this.nums = nums;
	}

	public void countingSort(int min, int max) {

		// allocate memory for the counter array O(k) memory complexity
		int[] countArray = new int[max - min + 1];

		// O(N) consider all items in the original array
		for (int i : this.nums) {
			countArray[i - min]++;
		}

		int z = 0;

		// count the occurrences in O(k) time
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				this.nums[z] = i;
				z++;
				countArray[i - min]--;
			}
		}
	}

	public void showArray() {
		for (int i = 0; i < this.nums.length; ++i) {
			System.out.print(nums[i] + "  ");
		}
	}

	public static void main(String[] args) {
		int[] nums = {7, 9, 3, 3, 5, 7, 10, 8, 1, 2, 6, 4};
		CountingSort countingSort = new CountingSort(nums);
		countingSort.countingSort(1, 10);
		countingSort.showArray();
	}

}
