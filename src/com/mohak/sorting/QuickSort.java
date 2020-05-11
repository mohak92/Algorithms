package com.mohak.sorting;

public class QuickSort {
	
	private int[] nums;
	
	public QuickSort(int[] nums) {
		this.nums = nums;
	}
	
	public void sort() {
		quickSort(0, nums.length-1);
	}
	
	private void quickSort(int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int pivotIndex = partition(low, high);
		quickSort(low, pivotIndex-1);
		quickSort(pivotIndex+1, high);
	}
	
	private int partition(int low, int high) {
		int pivotIndex = (low + high) / 2; // random index maybe better
        swap(pivotIndex, high);  // set the pivot to the end of list 
		
        int i = low;

        for (int j = low; j < high; ++j) {
            if (nums[j] <= nums[high]) {
                swap(i, j);
                i++;
            }
        }

        swap(i, high); // swap back the pivot

        return i;
	}
	
	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public void showArray() {
		for(int i = 0;i < nums.length;i++)
			System.out.print(nums[i] + " ");
	}
	
	public static void main(String[] args) {

        int[] nums = { 6,5,4,3 };
        QuickSort quicksort = new QuickSort(nums);
        quicksort.sort();
        quicksort.showArray();
    }
}
